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
		Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();  
        for (int t = 0;t<T;t++){
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i=0;i<N;i++){
                arr[i] =sc.nextInt();
            }
            Arrays.sort(arr);
            double median;
            if (N % 2 == 0){
                median =(arr[N/2-1]+ arr[N/2])/ 2.0;
            } else{
                median=arr[N/2];
            }
            System.out.println(median);
        }
	}
}
