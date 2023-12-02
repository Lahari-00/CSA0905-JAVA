import java.util.*;
class Skipping
{
	public static void main(String args[])
	{
		int m,n,k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter m: ");
		m=s.nextInt();
		System.out.println("enter n: ");
		n=s.nextInt();
		System.out.println("enter k: ");
		k=s.nextInt();
		for(int i=m;i<=n;i++)
		{
			System.out.println(i);
			i=i+k;
		}
	}
}