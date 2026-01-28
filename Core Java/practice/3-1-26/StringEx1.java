package com.a3;

public class StringEx1 
{
	public static void main(String[] args) 
	{
		String s1 = "tops";
		
		String s2 = new String("tops");
		
		char ch[]= {'t','o','p','s'};
		String s3 = new String(ch);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}