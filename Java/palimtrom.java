package com.string.buffer;
/*
 * String is group of charter 
 * String is class in java and it is also non primitive data type 
 * string object are immutable final is also immutable 
 * we can make string in two ways 1. using new keyword 2. using literal  
 * string has it speacial memory area called SCP  String constant pool 
 * when we cancat as string it get stored in new location and to get new string we have to assign some variable to get that new string 
 * in SCP garbage collected is not allowed 
 * In SCP unrefernced string are not deleted this makes waste but it provides high security where our password is insearted incorrect than we switch to old and unrefernced shring gets allowcate again 
 * Dubilcate values are not allowed in SCP
 * in string it is saved in charArray  
 *     
 */
import java.util.Scanner;

public class palimtrom {
	public static void main(String[] args) {
		String s = "   hello   ";//literal
		String a = new String();// no argument constructor 
		char ch[] = {'s','s','b','S','h','u','b','h','a','m'};
		String z = new String(ch);
		String t = new String("hel lo1");
		String w =t.concat(" 30");
		System.out.println(z.indexOf('h'));
		System.out.println(z.equals("hello"));
		System.out.println(s.equalsIgnoreCase("Hello"));
		System.out.println(z.toUpperCase());
		System.out.println(z.toLowerCase());
		System.out.println(z.contains("sb"));
		System.out.println(s);
		System.out.println(s.trim());
		System.out.println(z.length());
		
		
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string ");
		String original = sc.next();
		
		
		StringBuffer sb = new StringBuffer(original);
		
		
	}
	

}
