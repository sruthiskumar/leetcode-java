package Explore;

//Given an array of integers arr, return true if and only if it is a valid mountain array.
//Example 1:
//
//        Input: arr = [2,1]
//        Output: false
//        Example 2:
//
//        Input: arr = [3,5,5]
//        Output: false
//        Example 3:
//
//        Input: arr = [0,3,2,1]
//        Output: true
public class ValidMountainArray {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) {
            return false;
        }
        int i = 0;
        while(i+1 < arr.length && arr[i] < arr[i+1]) {
            i++;
        }
        if(i == 0 || i == arr.length-1) {
            return false;
        }
        while(i+1 < arr.length && arr[i] > arr[i+1]) {
            i++;
        }
        return i == arr.length-1;
    }
}
