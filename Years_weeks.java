import java.util.*;
class Years_weeks
{
	public static void main(String args[])
	{
		int years,weeks,days,d;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of days: ");
		d=s.nextInt();
		years=d/365;
		weeks=(d%365)/7;
		days=(d%365)%7;
		System.out.println("no.of years are: "+years);
		System.out.println("no.of weeks are: "+weeks);
		System.out.println("no.of days are: "+days);
	}
}