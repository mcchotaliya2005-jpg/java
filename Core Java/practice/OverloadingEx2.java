package com.a11;

public class OverloadingEx2 
{
	int cal(int a,int b)
	{
		return a+b;
	}
	double cal(double a,double b)
	{
		return a*b;
	}
	
	public static void main(String[] args) 
	{
		OverloadingEx2 o1 = new OverloadingEx2();
		System.out.println(o1.cal(5.0,2.0));
		
	}
}