/* package codechef; // don't place package name! */

import java.util.Scanner;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			
			Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T!=0){


            int N = sc.nextInt();
            int cnt = 0;

            int A[] = new int [N];
            for (int i=0; i<N; i++){
                A[i] = sc.nextInt();
            }
            int B [] = new int [N];
            for (int q=0; q < N; q++){
                B[q] = sc.nextInt();
            }

            for (int j=0; j< N; j++){
//                if ((A[j] < (2 * B[j])) || (B[j] < (2*A[j]))){
                if (((A[j]*2) < B[j]) || ((B[j]*2) < A[j])){
                     continue;
                }
                else{
                    cnt ++;
                }
            }
            System.out.println(cnt);
 
            T--;
        }
    }
}