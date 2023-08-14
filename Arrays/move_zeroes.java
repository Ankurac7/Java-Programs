package Arrays;
// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 // Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

// Example 2:
// Input: nums = [0]
// Output: [0]

import java.util.Arrays;
class Solution{
    public void moveZeroes(int[] nums){
        int n = nums.length;
        int lastNonZeroIndex = -1;
        for (int i = 0; i < n; i++){
            if (nums[i] != 0){
                lastNonZeroIndex++;
                int temp = nums[i];
                nums[i] = nums[lastNonZeroIndex];
                nums[lastNonZeroIndex] = temp;
            }
        }
    }
}
public class move_zeroes{
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        System.out.println(Arrays.toString(nums1)); // Output: [1, 3, 12, 0, 0]

        int[] nums2 = {0};
        solution.moveZeroes(nums2);
        System.out.println(Arrays.toString(nums2)); // Output: [0]
    }
}
// Time Complexity  : O(n)
// Space Complexity : O(1)
