/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int tests = scan.nextInt();
		while (tests!=0){
		    int consonants = 0;
		    boolean good = true;
		    int length = scan.nextInt();
		    String word = scan.next();
		    for (int i=0;i<length;i++){

		        String a = word.substring(i,i+1);
		        if (!(a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u"))){
		            consonants++;
		        }
		        else {
		            consonants = 0;
		        }
		        
		        if (consonants>=4){
		            good = false;
		            break;
		        }
		    }
		    
		    if (good==true)
		        System.out.println("YES");
		    else   
		        System.out.println("NO");
		    tests--;
		}
	}
}