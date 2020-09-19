/*
 * Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
 * Return the array in the form [x1,y1,x2,y2,...,xn,yn].
 */
 
 class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] out = new int[2*n];
        int i = 0;
        int j = 0;
        while(i <  n) {
            out[j++] = nums[i];
            out[j++] = nums[n+i];
            i++;
        }
        return out;
    }
}
