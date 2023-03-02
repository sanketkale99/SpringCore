package springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute 	//used to bind form data to user data
	public void commonDataForModel(Model model)
	{
		model.addAttribute("description", "Complete Registration Form");
		System.out.println("This is common method..");
	}
	
	// jsp contact form controller
	@RequestMapping("/contact")
	public String showForm(Model m)
	{
		return "contact";
	}
	
						//method-1
	/*
	@RequestMapping(path="/processform", method = RequestMethod.POST )
	public String formHandler(HttpServletRequest request)
	{
		String uname = request.getParameter("userName");
		System.out.println("User Name is : "+uname);
		String email = request.getParameter("email");
		System.out.println("Email is : "+email);
		String pass = request.getParameter("password");
		System.out.println("Password is : "+pass);
		return "";
	}
	*/
	
							// method-2
	/*
	@RequestMapping(path="/processform", method = RequestMethod.POST )
	public String formHandler(
			@RequestParam(name="userName", required=true) String uname, 
			@RequestParam("email") String email, 
			@RequestParam("password") String pass, Model model){
		
		/*
		System.out.println("User Name is :"+uname);
		System.out.println("Email is : "+email);
		System.out.println("Password is : "+pass);
		
		//model attributes
		model.addAttribute("uname", uname);
		model.addAttribute("email",email);
		model.addAttribute("password",pass); 
		*/
	
	/*
		User user=new User();
		user.setUserName(uname);
		user.setEmail(email);
		user.setPassword(pass);
		
		System.out.println(user);
		model.addAttribute("user",user);
		
		return "success";
	}
	*/
	
						//method-3  - simple method
	@RequestMapping(path="/processform", method = RequestMethod.POST )
	public String formHandler(@ModelAttribute User user,  Model model){
		
		System.out.println(user);
		int id=this.userService.createUser(user);
		model.addAttribute("msg", "User Created with id "+ id);
		return "success";
	}
}
