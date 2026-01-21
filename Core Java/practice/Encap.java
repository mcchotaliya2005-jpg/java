package com.a3012;

public class Encap 
{
	public static void main(String[] args) 
	{
		Model m = new Model();
		
		m.setName("Shweta");
		m.setSurname("xyz");
		m.setCity("Rajkot");
		
		System.out.println(m.getName()+" from "+m.getCity());
	}
}