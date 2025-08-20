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
	
	@Bean(name = "lDate4")
	public LocalDate createLDate4()
	{
		System.out.println("AppConfiguration.createLDate4()");
		return LocalDate.now();
	}
	
	@Bean(name = "lDate1")
	public LocalDate createDate1()
	{
		System.out.println("AppConfiguration.createDate1()");
		return LocalDate.of(2002, 07, 17);
	}
	
	@Bean(name = "lDate2")
	public LocalDate createDate2()
	{
		System.out.println("AppConfiguration.createDate2()");
		return  LocalDate.of(2025, 1, 14);
	}
	
	@Bean(name ="lDate3")
	public LocalDate localDate3()
	{
		System.out.println("AppConfiguration.localDate3()");
		return LocalDate.of(1947, 8, 14);
	}
	
}
