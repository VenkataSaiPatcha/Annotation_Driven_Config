package com.sai.sbean;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder 
{	
	@Autowired
	@Qualifier("lDate4")
	private LocalDate date; //field injection
	
	//@Autowired
	private LocalTime time;
	
	
	@Autowired // constructor injection
	public WeekDayFinder(@Qualifier("lDate3") LocalDate date)
	{
		this.date=date;
		System.out.println("0-param constructor");
	}
	
	@Autowired // setter injection
	@Qualifier("lDate2")
	public void setLocalDate(LocalDate date)
	{
		this.date=date;
	}
	
	@Autowired // arbitary method injection
	@Qualifier("lDate1")
	public void assignDate(LocalDate date)
	{
		System.out.println("arbitary method");
		this.date=date;
	}
	
	public String findDayOnAWeek(String user)
	{
		System.out.println("WeekDayFinder.findDayOnAWeek()");
			int day=date.getDayOfWeek().getValue();
			if(day>=1 && day<=5)
				return "Working days on office :"+user;
			else return "WeekEnd days there is no office :"+user;
	}

}
