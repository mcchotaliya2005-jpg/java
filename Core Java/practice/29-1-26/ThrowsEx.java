package com.a29;

import java.io.IOException;

class M
{
	void m() throws IOException
	{
		System.out.println("M called");
	}
}
class N extends M
{
	void n() throws IOException
	{
		System.out.println("N called");	
	}
}
class P extends N
{
	void p() throws IOException
	{
		System.out.println("P called");
	}
}

public class ThrowsEx 
{
	public static void main(String[] args) throws IOException 
	{
		P p1 = new P();
		p1.m();
		p1.n();
		p1.p();
	}
	
}