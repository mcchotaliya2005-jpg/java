package com.a3012;

interface Myprint
{
	void print();
}
interface Mysave
{
	void save();
}


public class MultipleEx implements Myprint,Mysave
{
	
	@Override
	public void save() {
	
		System.out.println("saving");
		
	}

	@Override
	public void print() {
		System.out.println("printing");
		
	}
	public static void main(String[] args) 
	{
		MultipleEx m = new MultipleEx();
		m.print();
		m.save();
	}

	
}