package Explore;

//Given a fixed length array arr of integers, duplicate each occurrence of zero, shifting the remaining elements to the right.
//
//        Note that elements beyond the length of the original array are not written.
//
//        Do the above modifications to the input array in place, do not return anything from your function.
//        Example 1:
//
//        Input: [1,0,2,3,0,4,5,0]
//        Output: null
//        Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]

public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int length = arr.length-1;
        int count = 0;
        for(int i = 0; i <= length-count; i++) {
            if(arr[i] == 0) {
                if(i == length - count) {
                    arr[length] = 0;
                    length--;
                    break;
                }
                count++;
            }
        }
        int i = length - count ;
        for(int j = i; j >= 0; j--) {
            if(arr[j] == 0) {
                arr[j+count] = 0;
                count--;
                arr[j+count] = 0;

            } else {
                arr[j+count] = arr[j];
            }
        }
    }
}
