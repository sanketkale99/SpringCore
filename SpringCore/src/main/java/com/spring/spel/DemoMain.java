package com.spring.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class DemoMain {
	
	public static void main(String args[]) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/spel/spelconfig.xml");
		
		Demo d=(Demo) context.getBean("demo");
		
		System.out.println(d);
		
		SpelExpressionParser temp=new SpelExpressionParser();
		Expression expression=(Expression) temp.parseExpression("20+2");
		System.out.println(expression.getValue());
		
	}
	

}
