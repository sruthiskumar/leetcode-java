package Explore;

//Given a binary array, find the maximum number of consecutive 1s in this array if you can flip at most one 0.
//
//        Example 1:
//        Input: [1,0,1,1,0]
//        Output: 4
//        Explanation: Flip the first zero will get the the maximum number of consecutive 1s.
//        After flipping, the maximum number of consecutive 1s is 4.
public class MaxConsecutiveOnesII {
    public int findMaxConsecutiveOnes(int[] nums) {
        boolean isFlipped = false;
        int count = 0;
        int max = 0;
        int i = 0;
        int zeroIndex = 0;
        while(i < nums.length) {
            if(nums[i] == 1) {
                count++;
            } else {
                if(!isFlipped) {
                    isFlipped = true;
                    count++;
                    zeroIndex = i;
                } else {
                    isFlipped = false;
                    count = 0;
                    i = zeroIndex;
                }
            }
            max = Math.max(count, max);
            i++;
        }
        return max;
    }
}
