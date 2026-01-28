package com.a3;

import java.util.Scanner;

public class ArrayEx5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		int marks[]=new int[5];
		int total = 0;
		for(int i=0;i<5;i++)
		{
			marks[i]=sc.nextInt();
		}
		
		for(int i=0;i<5;i++)
		{
			total+=marks[i];
		}
		System.out.println(total);
	}
}