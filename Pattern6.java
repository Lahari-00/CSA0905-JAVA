import java.util.*;
class Pattern6
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n,i,j,k=1;
		System.out.println("enter the no.of rows: ");
		n=s.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}