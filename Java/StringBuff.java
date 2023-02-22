package com.string.buffer;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringBuff {
	/*
	 
	 * 
	 * 
	 * 
	 this are mutable 
	 * create using new keyword 
 * this also used to temp operation 
 * String builder are threat safe
 * String  allow one threat operation at time and makes it threat safe and this called synchronized 
 * all methods in java made by synchronized
 * string buffer object are threat safe same as string builder 
	 */
	
	
	
	public static void main(String[] args) {
		String s = new String("hello");//copy 1"hello"
		s.concat("Testing shartra");//new memery "hello testing shartar 
		System.out.println("using string "+s);
		
		StringBuffer sb = new StringBuffer("hello");
		sb.append("testing shartra");//hello testing shartar
		//it is stroage in heap memory 
		
		System.out.println("using stringbuffer:"+sb);
		//palindrome program using string buffer
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String original =sc.next();
		
		
		if(original.equals(new String(new StringBuffer(original).reverse()))) {
			System.out.println("String is palindrome");
			
		}else {
			System.out.println("String is not palindrome");
		}
		System.out.println("\"hello\"");
		
		//regular expersion program 
		
		String c = "haondi20492nniwe2093";
		Pattern p = Pattern.compile("\\d");
		Matcher m = p.matcher(c);
		int result = 0;
		
		while(m.find()) {
			result = result + Integer.parseInt(m.group());
			
		}
		System.out.println("result ="+result);
		
		
	}

}
