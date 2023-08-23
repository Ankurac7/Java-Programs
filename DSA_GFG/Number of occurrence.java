package DSA_GFG;

// Driver Code Ends

//User function Template for Java

class Solution{
    public int getOccurrenceIndex(int[] arr, int x, boolean isLeftSide, int n){
        int start = 0;
        int end = n - 1;
        int ans = -1;
        
        while (start <= end){
            int mid = start + (end - start) / 2;
            if (arr[mid] == x){
                ans = mid;
                if (isLeftSide){
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } 
            else if (arr[mid] < x){
                start = mid + 1;
            } 
            else{
                end = mid - 1;
            }
        }
        
        return ans;
    }
    
    public int count(int[] arr, int n, int x){
        int left = getOccurrenceIndex(arr, x, true, n);
        int right = getOccurrenceIndex(arr, x, false, n);
        
        if (left == -1 && right == -1){
            return 0;
        }
        
        return right - left + 1;
    }
}
