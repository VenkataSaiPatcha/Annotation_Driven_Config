package com.sai.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.sai")
@Configuration
public class AppConfiguration
{
	public AppConfiguration()
	{
		System.out.println("AppConfiguration.AppConfiguration()");
	}
	
	@Bean(name = "ldate")
	public LocalDate createLDate()
	{
		System.out.println("AppConfiguration.createLDate()");
		return LocalDate.now();
	}
}
