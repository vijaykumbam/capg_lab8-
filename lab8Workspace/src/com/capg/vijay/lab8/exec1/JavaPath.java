package com.capg.vijay.lab8.exec1;

import java.io.FileOutputStream;

public class JavaPath {

	public static void main(String[] args) throws Exception{
		
		FileOutputStream fos  = new FileOutputStream("javapath.txt");
		fos.write(5121);
		System.out.println(fos);
		// TODO Auto-generated method stub

	}

}
