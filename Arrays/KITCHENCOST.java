/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		         Scanner sc=new Scanner(System.in);
				 int t=sc.nextInt();
				 for(int i=0;i<t;i++){
				 int n=sc.nextInt();
				 int x=sc.nextInt();
				 int count=0;
				 int a[]=new int[n];
				 int b[]=new int[n];
				 for(int j=0;j<n;j++)a[j]=sc.nextInt();
				 for(int j=0;j<n;j++) b[j]=sc.nextInt();
				 for(int j=0;j<n;j++){
				     if(a[j]>=x) count+=b[j];
				 }
		       System.out.println(count);
				 
				 }
	}
}
