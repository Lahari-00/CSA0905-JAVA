import java.util.*;
class Pattern1
{
	public static void main(String agrs[])
	{
		int i,j,k,n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of rows: ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(i=n-1;i>=0;i--)
		{
			for(j=n-i;j>=1;j--)
			{
				System.out.print(" ");
			}
			for(k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}
}