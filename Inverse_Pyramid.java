import java.util.*;
class Inverse_Pyramid
{
	public static void main(String args[])
	{
		int n,i,j,k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of rows: ");
		n=s.nextInt();
		for(i=n-1;i>=0;i--)
		{
			for(j=n-1;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(k=0;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}