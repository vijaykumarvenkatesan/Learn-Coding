// Sort in specific order
//Difficulty: EasyAccuracy: 52.55%Submissions: 42K+Points: 2
//Given an array arr[] of positive integers. Your task is to sort them so that the first part of the array contains odd numbers sorted in descending order, and the rest of the portion contains even numbers sorted in ascending order.
//
//Examples:
//
//Input: arr[] = [1, 2, 3, 5, 4, 7, 10]
//Output: [7, 5, 3, 1, 2, 4, 10]
//Explanation: 7 5 3 1 are odds in descending order and 2 4 10 are evens in ascending order.
//Input: arr[] = [0, 4, 5, 3, 7, 2, 1]
//Output: [7, 5, 3, 1, 0, 2, 4]
//Explanation: 7 5 3 1 are odds in descending order and 0 2 4 are evens in ascending order.
//Expected Time Complexity:  O(nlog(n))
//Expected Auxiliary Space:  O(1)
//
//Constraints:
//
//1 ≤ arr.size() ≤ 105
//0 <= arri <= 1018

import java.util.ArrayList;
import java.util.Arrays;

public class sortInSpecificOrder {
    public void sortIt(Long arr[]) {
        // code here.
        int point =0;
        Arrays.sort(arr);
        ArrayList<Long> odd = new ArrayList<>();
        ArrayList<Long> even = new ArrayList<>();
        for(long i:arr) {
            if(i%2==1) odd.add(i);
            else even.add(i);
        }
        for(int i=odd.size()-1;i>=0;i--) arr[point++] = odd.get(i);
        for(int i=0; i<even.size();i++) arr[point++] = even.get(i);

    }
    public static void main(String[] args) {

    }
}
