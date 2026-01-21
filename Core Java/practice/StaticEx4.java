package com.a11;

public class StaticEx4 
{
	int id;
	String name;
	static String college="VVP";//static variable
	
	public StaticEx4(int id,String name) 
	{
		this.id=id;
		this.name=name;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+college);
	}
	
	 static void change()
	{
		college="Atmiya";
	}
	
	public static void main(String[] args) 
	{
		change();
		
		StaticEx4 s1 = new StaticEx4(101,"abcd");
		StaticEx4 s2 = new StaticEx4(102,"pqrs");
		
		s1.display();
		s2.display();
	}
	
	
	
}