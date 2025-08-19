package com.sai.sbean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wdf")
public class WeekDayFinder 
{	
	@Autowired
	private LocalDate date; //field injection
	
	public WeekDayFinder()
	{
		System.out.println("0-param constructor");
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
