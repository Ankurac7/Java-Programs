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
        int T = sc.nextInt();

        while (T-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();

            int[] a =new int[x];
            int[] b =new int[y];

            for (int i = 0; i < x; i++){
                a[i] =sc.nextInt();
            }

            for (int i = 0; i < y; i++){
                b[i] =sc.nextInt();
            }

            int maxConnections = findMax(a, b);
            System.out.println(maxConnections);
        }

        sc.close();
	}
	private static int findMax(int[] a, int[] b){
        int x = a.length;
        int y = b.length;

        int[][] dp = new int[x + 1][y + 1];

        for (int i =1; i <=x; i++) {
            for (int j =1; j <=y; j++) {
                if (a[i-1] == b[j-1]) {
                    dp[i][j] = dp[i-1][j-1]+1;
                } else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[x][y];
    }
}
