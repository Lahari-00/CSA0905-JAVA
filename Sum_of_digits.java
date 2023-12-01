import java.util.*;
class Sum_of_digits
{
	public static void main(String args[])
	{
		int rem,sum=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number: ");
		n=s.nextInt();
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("sum of the digits is: "+sum);
	}
}