//Largest Element in Array
//Difficulty: BasicAccuracy: 67.48%Submissions: 414K+Points: 1Average Time: 20m
//Given an array arr[]. The task is to find the largest element and return it.
//
//        Examples:
//
//Input: arr[] = [1, 8, 7, 56, 90]
//Output: 90
//Explanation: The largest element of the given array is 90.
//Input: arr[] = [5, 5, 5, 5]
//Output: 5
//Explanation: The largest element of the given array is 5.
//Input: arr[] = [10]
//Output: 10
//Explanation: There is only one element which is the largest.
//        Constraints:
//        1 <= arr.size()<= 106
//        0 <= arr[i] <= 106


public class largestElement {
    public static void main(String[] args) {
        int arr[] = new int[8];
        int largest =0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>largest) largest = arr[i];
        }
        System.out.println(largest);
    }
}
