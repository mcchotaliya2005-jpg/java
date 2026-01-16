import java.util.Scanner;

public class EmailPassEx 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Email: ");
		String Email = sc.next();
		
		System.out.println("Enter Your Password: ");
		String Password = sc.next();
		
		if(Email.equals("tops@gmail.com") && Password.equals("1234"))
		{
			System.out.println("Logged in Success");
		}
		else
		{
			System.out.println("Log in Fail");
		}
			
	}
}