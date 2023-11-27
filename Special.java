import java.util.*;
class Special
{
	public static void main(String args[])
	{
		int count=0,i;
		String s1;
		char ch;
		Scanner s=new Scanner(System.in);
		System.out.println("enter string: ");
		s1=s.nextLine();
		int l=s1.length();
		for(i=0;i<l;i++)
		{
			ch=s1.charAt(i);
			if(ch =='@' || ch =='$' || ch =='%' || ch =='&' || ch =='*' || ch=='#')
			{
				count++;
			}
		}
		System.out.println("no.of spaecial characters are: "+count);
		
	}
}