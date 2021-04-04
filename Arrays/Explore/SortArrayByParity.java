package Explore;

//Given an array A of non-negative integers, return an array consisting of all the even elements of A, followed by all the odd elements of A.
//
//        You may return any answer array that satisfies this condition.
//
//        Example 1:
//
//        Input: [3,1,2,4]
//        Output: [2,4,3,1]
//        The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
public class SortArrayByParity {
    public int[] sortArrayByParity(int[] A) {
        int i = 0;
        int j = A.length - 1;
        while(i < j) {
            while(i < j && A[i] % 2 == 0) {
                i++;
            }
            while(i < j && A[j] % 2 != 0) {
                j--;
            }
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        return A;
    }
}
