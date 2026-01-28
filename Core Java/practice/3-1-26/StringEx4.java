package com.a3;

public class StringEx4 
{
	public static void main(String[] args) 
	{
		String s1 = "sachin";
		String s2 = "sachin";
		String s3 = "  ratan  ";
		String s4 = new String("sachin");
		String s5 = "SACHIN";
		String s6 = "DHARINI";
		String s7 = "abcd is a programming language,abcd is a everygreen platform";
		
		System.out.println(s1.toUpperCase());
		System.out.println(s6.toLowerCase());
		System.out.println(s3.trim());
		System.out.println(s2.charAt(1));
		
		System.out.println(s7.replace("abcd","java"));
		
		
	}
}