package com.a29;

public class BankAccount 
{
	public static void main(String[] args) 
	{
		BankAccount bankAccount = new BankAccount();
		CheckingAccount ca = new CheckingAccount(101);
		ca.deposite(50000);
		
		try 
		{
			ca.withdral(70000);
			System.out.println("Your balance is = "+ca.getBalance());
		}
		catch (InsufficintFundException e) 
		{
			// TODO Auto-generated catch block
			System.out.println("You have no sufficient balance, You need more  "+e.getAmount());
			System.out.println("Your balance is = "+ca.getBalance());
		}
	
	}
}