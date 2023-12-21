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
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    String a = sc.next();
		    int count0=0, count1=0;
		    for(int i=0;i<a.length();i++){
		        if(a.charAt(i)=='0') count0++;
		        else count1++;
		    }if((count0==1)||(count1==1)) System.out.println("Yes");
		    else System.out.println("No");
		}
	}
}