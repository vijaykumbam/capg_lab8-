package com.capg.vijay.lab8.exec1;

import java.io.*;
import java.util.Scanner;

public class CopyDataThread extends Thread implements Serializable
{
	void getCopyFile()throws Exception
	{
		//FileOutputStream foss = new FileOutputStream("sourceFile.txt"); //To create the sourcefile and send the data to it
		FileInputStream fis = new FileInputStream("sourceFile.txt");// The data is present inside the file -->program
		FileOutputStream fos = new FileOutputStream("targetFile.txt");// targetfile is created
		while((fis.read())!=-1)
		{
			int data;
			for(int loop=1;loop<=10;loop++)
			{
				data=fis.read();
				fos.write(data);
			}
			Thread.sleep(1*1000);
			System.out.println("slept for 5 sec");
			System.out.println("10 characters were copied from source to target");
		}
		
	}
	
	public void run()
	{
		try
		{
			System.out.println("Entered into the try block");
			getCopyFile();
			System.out.println("every thing is copied from file");
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}