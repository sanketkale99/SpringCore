package springmvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")		//Annotation for mapping web requests, this method works when /home fires in web browser
	public String home(Model model)
	{
		System.out.println("This is home controller");
		model.addAttribute("name", "Abhishek Gavhane");
		List<String> friends=new ArrayList<String>();
		friends.add("Abhishek Gavhane");
		friends.add("Mayur Shinde");
		friends.add("Aditya Ghyar");
		friends.add("Aditi Magdum");
		model.addAttribute("friends",friends);
		return "index";		//retrun index view which is a .jsp file 
	}
	
	@RequestMapping("/about")
	public ModelAndView about()
	{
		System.out.println("This is help controller...");
		//creating model AND view object
		ModelAndView modelAndView=new ModelAndView();
		//setting data 
		modelAndView.addObject("address","Shivajinagar Pune");
		modelAndView.addObject("pincode","411005");
		LocalDateTime now=LocalDateTime.now();
		modelAndView.addObject("time",now);
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(3442);
		modelAndView.addObject("marks",list);
		
		//setting view name 
		modelAndView.setViewName("help");
		
		return modelAndView;
	}
	
}
