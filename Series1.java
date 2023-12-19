import java.util.*;
class Series1
{
	public static void main(String args[])
	{
		int i,sum=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value: ");
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
}