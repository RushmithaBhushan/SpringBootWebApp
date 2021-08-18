package com.example.springboot.web;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFIle {
	
	
	public static void main(String args[]) {
		
		try {
			File f = new File("C:\\Users\\rushm\\eclipse-workspace\\springboot-web\\src\\main\\resources\\sampleText");
			BufferedReader sc = new BufferedReader(new FileReader(f));
			String str;
			while((str = sc.readLine()) != null){
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
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
