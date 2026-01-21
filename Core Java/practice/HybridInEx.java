package com.a3012;

class A5
{
	void a5()
	{
		System.out.println("A5");
	}
}
class B5 extends A5
{
	void b5()
	{
		System.out.println("B5");
	}
}
interface C5 
{
	void c5();
	
}
class D5 extends B5 implements C5
{
	void d5()
	{
		System.out.println("D5");
	}

	@Override
	public void c5() 
	{
		System.out.println("C5");
	}
}

public class HybridInEx 
{
	public static void main(String[] args)
	{
		D5 d = new D5();
		d.a5();
		d.b5();
		d.c5();
		d.d5();
	}
}