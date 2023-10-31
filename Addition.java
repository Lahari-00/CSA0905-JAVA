import java.util.*;
class Addition
{
	int a,b,c,total1,total2;
	void add(int x,int y)
	{
		a=x;
		b=y;
		total1=x+y;
		System.out.println("sum of two numbers is:"+total1);

	}
	void add(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		total2=x+y+z;
		System.out.println("sum of three numbers is: "+total2);
	}
	public static void main(String args[])
	{
		int e,f,g;
		Scanner s=new Scanner(System.in);
		System.out.println("enter first number: ");
		e=s.nextInt();
		System.out.println("enter second number: ");
		f=s.nextInt();
		System.out.println("enter third number: ");
		g=s.nextInt();
		Addition obj=new Addition();
		obj.add(e,f);
		obj.add(e,f,g);
	}
}