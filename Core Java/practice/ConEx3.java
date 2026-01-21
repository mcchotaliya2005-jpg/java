package com;

public class ConEx3 
{
	String n,s,e;
	ConEx3(String name,String surname,String email) 
	{
		n = name;
		s = surname;
		e = email;
	}
	ConEx3(ConEx3 c1)
	{
		System.out.println(c1.n);
		System.out.println(c1.s);
		System.out.println(c1.e);
	}
	public static void main(String[] args) 
	{
		ConEx3 c1 = new ConEx3("Manan","chotaliya","manan@gmail.com");
		ConEx3 c2 = new ConEx3(c1);
	}
}
