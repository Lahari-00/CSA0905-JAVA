import java.util.*;
class Vote
{
	public static void main(String args[])
	{
	int age,b;
	Scanner s=new Scanner(System.in);
	System.out.println("enter the age of a person: ");
	age=s.nextInt();
	if(age>=18)
	{
		System.out.println("eligible to vote");
	}
	else
	{
		b=18-age;
		System.out.println("You are allowed to vote after"+b"years");
	}
	}
}