package com.capg.vijay.lab8.exec1;

import java.io.*;
import java.util.Scanner;

public class FileProgram extends Thread
{
	public static void main(String args[])
	{
		CopyDataThread obj = new CopyDataThread();
		Thread t1 = new Thread(obj);
		t1.start();
		//obj.getCopyFile(sourceFile,targetFile);
	}
}
