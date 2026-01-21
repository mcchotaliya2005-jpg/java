package com.a11;

public class OverloadingEx1 
{
	int cal(int a,int b)
	{
		return a+b;
	}
	int cal(int a,int b,int c)
	{
		return a*b*c;
	}
	
	public static void main(String[] args) 
	{
		OverloadingEx1 o1 = new OverloadingEx1();
		System.out.println(o1.cal(5,2,3));
		
	}
}