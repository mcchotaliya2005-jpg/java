import java.util.Scanner;

public class IfElse 
{
	public static void main(String[] args)
	{
		//Scanner
		//classname objname = new classname();
		System.out.println("Enter Your Age: ");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			System.out.println("Not Eligible to vote");
		}
	}
}