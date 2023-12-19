import java.util.*;
class Series4
{
	public static void main(String args[])
	{
		int i,sum=0,n,fact=1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value: ");
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			fact=fact*i;
			sum=sum+fact;
		}
		System.out.println(sum);
	}
}