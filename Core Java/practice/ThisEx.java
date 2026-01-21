package com.a3012;

import java.util.Scanner;

public class ThisEx 
{
	 int id;
	 String name;
	
	 ThisEx(int id,String name)
	 {
		 this.id = id;
		 this.name = name;
	 }
	 
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your id");
		int id2 = sc.nextInt();
		System.out.println("Enter Your name");
		String name2=sc.next();
		
		ThisEx t1 = new ThisEx(id2,name2);
//		t1.id=id2;
//		t1.name=name2;
//		
		t1.display();
	}
}