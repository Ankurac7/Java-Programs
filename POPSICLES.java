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
        while (T-- > 0) {
            int n = sc.nextInt();
            int[] prices = new int[n]; 

            for (int i = 0; i < n; i++) {
                prices[i] = sc.nextInt();
            }

            int lowestPrice = findLowestPrice(n, prices);
            System.out.println(lowestPrice);
        }

        sc.close();
	}
    private static int findLowestPrice(int n, int[] prices) {
        Arrays.sort(prices); 
        int minPrice = Integer.MAX_VALUE;

        for (int i = 1; i < n; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff <= 10) {
                int averagePrice = (prices[i] + prices[i - 1]) / 2;
                minPrice = Math.min(minPrice, averagePrice);
            } else {
                minPrice = Math.min(minPrice, prices[i] - 10);
            }
        }
        minPrice = Math.min(minPrice, prices[0] + 10);
        minPrice = Math.min(minPrice, prices[n - 1] - 10);

        return minPrice;
    }
}
