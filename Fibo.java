import java.util.*;
class Fibo
{
	int a,n1=0,n2=1,sum=0;
	void change(int x)
	{
	a=x;
	System.out.println(+n1);
	System.out.println(+n2);
	}
	void calculate()
	{
		int i;
		for(i=2;i<a;i++)
		{
			sum=n1+n2;
			System.out.println(+sum);
			n1=n2;
			n2=sum;
			
		}
	}
	
	public static void main(String args[])
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the n value: ");
		n=s.nextInt();
		Fibo obj=new Fibo();
		obj.change(n);
		obj.calculate();
		
	}

}