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
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0){
		    int n=s.nextInt();
		    int k=s.nextInt();
		    int v=s.nextInt();
		    int arr[]=new int[n];
		    for(int i=0;i<n;i++){
		        arr[i]=s.nextInt();
		    }
		    int sum=0;
		    for(int i=0;i<n;i++){
		        sum+=arr[i];
		    }
		   if(sum>=(v*(n+k))){
		       System.out.println("-1");
		   }
		   else{
		       int avg1=(((n+k)*v)-sum);
		       if(avg1%k==0){
		           System.out.println(avg1/k);
		       }
		       else{
		           System.out.println(-1);
		       }
		   }
		}
	}
}