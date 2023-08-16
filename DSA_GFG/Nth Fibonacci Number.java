package DSA_GFG;

// Driver Code Ends

//User function Template for Java

class Solution{
    public int nthFibonacci(int n){
        int mod = (int) 1e9 + 7;
        if (n == 1 ||n == 2){
            return 1;
        }
        int prev = 1;
        int pPrev = 1;
        int ans = prev + pPrev;
        for (int i = 3; i <= n; i++){
            ans= (pPrev + prev) % mod;
            pPrev= prev;
            prev= ans;
        }
        return ans;
    }
}
