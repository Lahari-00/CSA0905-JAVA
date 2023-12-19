import java.util.*;
class Series3
{
	public static void main(String args[])
	{
		int i,sum=0,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value: ");
		n=s.nextInt();
		for(i=1;i<n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+(i*i);
			}
		}
		System.out.println(sum);
	}
}