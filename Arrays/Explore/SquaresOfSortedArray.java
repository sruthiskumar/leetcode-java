package Explore;

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of
// each number sorted in non-decreasing order.
//        Example 1:
//
//        Input: nums = [-4,-1,0,3,10]
//        Output: [0,1,9,16,100]
//        Explanation: After squaring, the array becomes [16,1,0,9,100].
//        After sorting, it becomes [0,1,9,16,100].
public class SquaresOfSortedArray {
    public int[] sortedSquares(int[] nums) {
        int[] out = new int[nums.length];
        int low = 0;
        int high = nums.length - 1;
        int i = nums.length - 1;
        while(low <= high && i >= 0) {
            if(Math.abs(nums[low]) > Math.abs(nums[high])){
                out[i] = nums[low] * nums[low];
                i--;
                low++;
            } else {
                out[i] = nums[high] * nums[high];
                i--;
                high--;
            }
        }
        return out;
    }
}
