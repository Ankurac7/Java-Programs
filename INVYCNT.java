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
        
        while( t-- > 0 ){
            
            int n = sc.nextInt();
            
            int k = sc.nextInt();
            
            int a[] = new int[n];
            
            for( int i = 0 ; i < n ; i++ ) a[i] = sc.nextInt();
            long sum = 0l;
            for( int i = 1 ; i <= k ; i++ ){
                sum += i;
            }
            int[] left = new int[n];
            int[] right = new int[n];
            
            for(int i = 0 ; i < n ; i++){
                for( int j = 0 ; j < i ; j++ ){
                    if( a[i] > a[j] ) left[i]++;
                }
                for( int j = i+1 ; j < n ; j++ ){
                    if( a[i] > a[j] ) right[i]++;
                }
            }
            long ans = 0l;
            long sumL = sum - k;
            for( int i = 0 ; i < n ; i++ ){
                ans += (left[i]*sumL) + (right[i]*sum);
            }
            
            System.out.println(ans);
            // 2 1 3 2 1 3 2 1 3
            // 1*3
            // 0
            // 2*1
            // 4 + 3
            // 3
            // 2 4 3 1 2 4 3 1 2 4 3 1
            // 2 4 3 1
            // 1 * 6 = 6
            // 1 * 3 + 2 * 6 = 12 + 3
            // 1 * 3 + 1 * 6 = 3 + 6
            // 0
            // 99 2 1000 24
            // 2 * 100s = 10100
            // 0
            // 2 * 4950 + 1 * 5050 = 5050 + 9900
            // 1 * 4950 = 4950
            
        } 
		
	}
}
