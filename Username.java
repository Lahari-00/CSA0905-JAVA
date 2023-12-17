import java.util.*;
class Username
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner s= new Scanner(System.in);
		System.out.println("enter the username: ");
		s1=s.nextLine();
		System.out.println("reenter the username: ");
		s2=s.nextLine();
		if(s1.equals(s2))
		{
			System.out.print("valid username");
		}
		else
		{
			System.out.print(" not a valid username");
		}
	}
}