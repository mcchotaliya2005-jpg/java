package com;

public class ConEx2 
{
	int id;
	String name;
	
	public ConEx2(int i,String n) 
	{
		id = i;
		name = n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		ConEx2 c1 = new ConEx2(101,"a");
		ConEx2 c2 = new ConEx2(102,"b");
		ConEx2 c3 = new ConEx2(103,"c");
		ConEx2 c4 = new ConEx2(104,"d");
		
		c1.display();
		c2.display();
		c3.display();
		c4.display();
	}
	
}
