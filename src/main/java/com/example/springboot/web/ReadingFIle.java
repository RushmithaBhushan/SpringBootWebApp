package com.example.springboot.web;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFIle {
	
	
	public static void main(String args[]) {
		
		try {
			File f = new File("C:\\Users\\rushm\\eclipse-workspace\\springboot-web\\src\\main\\resources\\sampleText");
			Scanner sc = new Scanner(f);
			while(sc.hasNextLine()){
		        String str = sc.nextLine();
		        String fieldName, fieldValue;
		        Scanner lineScanner = new Scanner(str);
		        lineScanner.useDelimiter("=");
		        while(lineScanner.hasNext()){
		        	fieldName = lineScanner.next();
		        	fieldValue = lineScanner.next();
		          System.out.println(fieldName + ":" + fieldValue);  
		        }
		        lineScanner.close();
		      }
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
