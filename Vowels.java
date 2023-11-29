import java.util.*;
class Vowels
{
	public static void main(String args[])
	{
		int vowel=0,consonants=0,i,len;
		char ch;
		String s1;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string: ");
		s1=s.nextLine();
		len=s1.length();
		for(i=0;i<len;i++)
		{
			ch=s1.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
			{
				vowel++;
			}
			else
			{
				consonants++;
			}

		}
		System.out.println("no.of vowels are: "+vowel);
		System.out.println("no.of consonants are: "+consonants);
	}
}