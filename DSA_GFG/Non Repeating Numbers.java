package DSA_GFG;

// Driver Code Ends

//User function Template for Java

class Solution{
    public static int[] singleNumber(int[] nums){
        int xor = 0; 
        for (int num: nums){
            xor ^= num;
        }

        int mask =xor & -xor;
        int num1=0, num2=0;
        for (int num: nums){
            if ((num & mask)==0){
                num1^=num;
            }else
                num2^=num;
        }
        return new int[]{Math.min(num1, num2), Math.max(num1,num2)};
    }

    /**
     * @param args
     */
    public static void main(String[] args){
        int[] nums={2,4,7,9,2,4};
        int[] result=singleNumber(nums);
        System.out.println("The two distinct numbers are: " +result[0]+" and "+result[1]);
    }
}