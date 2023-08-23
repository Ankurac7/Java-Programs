package DSA_GFG;

// Driver Code Ends

import java.util.ArrayList;
import java.util.Collections;

class Solution{
    // Function to find the leaders in the array.
    public ArrayList<Integer> leaders(int[] a, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int prev = Integer.MAX_VALUE;
        for (int i=n-1; i>= 0; i--){
            if (a[i] >= prev) {
                ans.add(a[i]);
                prev=Math.max(prev, a[i]);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
