package com.capg.vijay.lab8.exec2;
import java.time.*;
public class TimerDisplay implements Runnable{

	public void run()
	{			
		for(int loop=1;loop<10;loop++)
		{
			try {
				Thread.sleep(10*1000);
				LocalTime time = LocalTime.now();
				System.out.println(time);
				System.out.println("it is refreshed by 10 sec:-)");
			}
			catch (Exception e)
			{
				
			}
		}
		System.out.println("It been a min :-) \nThanks for wasting 1 min :-)");
	}
	
	public static void main(String[] args) {
		TimerDisplay obj = new TimerDisplay();
		Thread t1 = new Thread(obj);
		t1.start();

	}

}

//Write a thread program to display timer where timer will get refresh after every 10seconds.