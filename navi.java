import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,max;
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter number of ele");	
		n=sc.nextInt();
		int a[]  = new int[n];
		System.out.println("enter the ele are");
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=0;i<n;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("max num is"+max);
	}
	
			}
		
		
