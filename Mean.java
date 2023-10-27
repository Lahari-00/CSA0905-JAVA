import java.util.*;
class Mean
{
	public static void main(String args[])
	{
		int i,j,n,sum=0,mean,temp,c,maxcount=0,count=0;
		int a[]=new int[10];
		Scanner s=new Scanner(System.in);
		System.out.println("enter the no.of elements: ");
		n=s.nextInt();
		System.out.println("enter the elements: ");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(i=0;i<n-1;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("After sorting: ");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		for(i=0;i<n;i++)
		{
			sum=sum+a[i];
		}
		mean=sum/n;
		System.out.println("mean is :"+mean);
		if(n%2!=0)
		{
		System.out.println("median is: "+a[n/2]);
		}
		else
		{
			c=(a[n/2]+a[(n/2)-1])/2;
			System.out.println("median is: "+c);
		}
		int frequency[] = new int[n];
		int mode = a[0];
		maxcount = 1;
		for (i = 0; i < n; i++) 
		{
    			count = 0;
    			for (j = 0; j < n; j++) 
			{
        			if (a[i] == a[j]) 
				{
            				count++;
       				 }
    			}
    			frequency[i] = count;
    			if (count > maxcount) 
			{
        			maxcount = count;
        			mode = a[i];
    			}
		}
		if (maxcount == 1) 
		{
    			System.out.println("No mode in the dataset");
		} 
		else 
		{
    			System.out.println("Mode is: " + mode);
		}		
	}
}