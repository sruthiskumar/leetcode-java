package Explore;

import java.util.HashSet;
import java.util.Set;

//Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
//
//        More formally check if there exists two indices i and j such that :
//
//        i != j
//        0 <= i, j < arr.length
//        arr[i] == 2 * arr[j]
//
//
//        Example 1:
//
//        Input: arr = [10,2,5,3]
//        Output: true
//        Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
public class CheckIfNAndItsDoubleExist {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(set.contains(arr[i] * 2) || (set.contains(arr[i]/2) && arr[i]%2 == 0)) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}
