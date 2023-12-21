/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kb=new Scanner(System.in);
		int t=kb.nextInt();
		while(t-->0){
		    int a=kb.nextInt();
		    int b=kb.nextInt();
		   
		    if(a==1||b==1)
               System.out.println("NO");
   
            else
               System.out.println(a%2==1&&b%2==1?"No":"Yes");
		}
	}
}