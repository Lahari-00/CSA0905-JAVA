import java.util.*;
class Gcdlcm
{
	public static void main(String args[])
	{
		int i,j,gcd=1,lcm,n1,n2;
		Scanner s=new Scanner(System.in);
		System.out.println("enter n1:");
		n1=s.nextInt();
		System.out.println("enter n2:");
		n2=s.nextInt();
		for(i=1;i<=n1 && i<=n2;i++)
		{
			if(n1%i==0 && n2%i==0)
			{
				gcd=i;
			}
		}
		System.out.println("gcd is: "+gcd);
		lcm=(n1*n2)/gcd;
		System.out.println("lcm is: "+lcm);
	}
}