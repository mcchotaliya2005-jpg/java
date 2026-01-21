package com.a3012;

class A1
{
	void a()
	{
		System.out.println("A Called");
	}
}
class B1 extends A1
{
	void b()
	{
		System.out.println("B Called");
	}
}
class C1 extends B1
{
	void c()
	{
		System.out.println("C Called");
	}
}
public class MultiEx2 
{
	public static void main(String[] args) 
	{
		C1 c = new C1();
		
		c.a();
		c.b();
		c.c();
	}
}