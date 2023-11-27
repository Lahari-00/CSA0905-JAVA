import java.util.*;
class Missing
{
	public static void main(String args[])
	{
		int n,l,m,i,flag=0,ans=0;	
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter min value: ");
		l=s.nextInt();
		System.out.println("enter max value: ");
		m=s.nextInt();
		System.out.println("enter the no.of values: ");
		n=s.nextInt();
		System.out.println("enter the values: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Missing number is: ");
		for(i=l;i<m;i++)
		{
			flag=0;
			for(int j=0;j<=n;j++)
			{
				if(i==a[j])
				{
					flag=1;
				}
				else
				{
					continue;
				}

			}
			if(flag==0)
			{
				ans=i;
				break;
			}
		}
		System.out.println(ans);
	}
}