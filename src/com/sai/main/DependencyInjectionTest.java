package com.sai.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sai.config.AppConfiguration;
import com.sai.sbean.WeekDayFinder;

public class DependencyInjectionTest 
{
	public static void main(String[] args) 
	{
		System.out.println("DependencyInjectionTest.main()");
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(AppConfiguration.class); //IOC created
			
		WeekDayFinder week =ctx.getBean("wdf",WeekDayFinder.class);
		String result=	week.findDayOnAWeek("sai");
		System.out.println(result);
		ctx.close();
		System.out.println("DependencyInjectionTest.main()");
	}

}
