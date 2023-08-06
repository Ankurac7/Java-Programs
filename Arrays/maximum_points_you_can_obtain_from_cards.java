package Arrays;

// There are several cards arranged in a row, and each card has an associated number of points. The points are given in the integer array cardPoints.

// In one step, you can take one card from the beginning or from the end of the row. You have to take exactly k cards.

// Your score is the sum of the points of the cards you have taken.

// Given the integer array cardPoints and the integer k, return the maximum score you can obtain.

// Example 1:
// Input: cardPoints = [1,2,3,4,5,6,1], k = 3
// Output: 12
// Explanation: After the first step, your score will always be 1. However, choosing the rightmost card first will maximize your total score. The optimal strategy is to take the three cards on the right, giving a final score of 1 + 6 + 5 = 12.

// Example 2:
// Input: cardPoints = [2,2,2], k = 2
// Output: 4
// Explanation: Regardless of which two cards you take, your score will always be 4.

// Example 3:
// Input: cardPoints = [9,7,7,9,7,7,9], k = 7
// Output: 55
// Explanation: You have to take all the cards. Your score is the sum of points of all cards.
import java.util.*;
class Solution{
    public int maxScore(int[] cardPoints, int k){
        int n = cardPoints.length;
        int ans = 0;
        for (int i = 0; i < k; i++){
            ans += cardPoints[i];
        }
        int cardsFromFrontIndex = k - 1;
        int cardsFromBackIndex = n;
        int curr = ans;
        while (cardsFromFrontIndex >= 0){
            curr -= cardPoints[cardsFromFrontIndex--];
            curr += cardPoints[--cardsFromBackIndex];
            ans = Math.max(ans, curr);
        }
        return ans;
    }
    public static void main(String[] args){
        Solution solution = new Solution();
        int[] cardPoints1 = {1, 2, 3, 4, 5, 6, 1};
        int k1 = 3;
        int maxScore1 = solution.maxScore(cardPoints1, k1);
        System.out.println("Maximum Score for [1, 2, 3, 4, 5, 6, 1] with k = 3: " + maxScore1);
        int[] cardPoints2 = {2, 2, 2};
        int k2 = 2;
        int maxScore2 = solution.maxScore(cardPoints2, k2);
        System.out.println("Maximum Score for [2, 2, 2] with k = 2: " + maxScore2);
        
        int[] cardPoints3 = {9, 7, 7, 9, 7, 7, 9};
        int k3 = 7;
        int maxScore3 = solution.maxScore(cardPoints3, k3);
        System.out.println("Maximum Score for [9, 7, 7, 9, 7, 7, 9] with k = 7: " + maxScore3);
    }
}
// Time Complexity  : O(k) + O(k) = O(k)
// Space Complexity : O(1)