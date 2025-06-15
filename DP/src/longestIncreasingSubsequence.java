import java.util.ArrayList;
import java.util.Collections;

public class longestIncreasingSubsequence {
    public static void main(String[] args) {
        int nums[] = {10,9,2,5,3,7,101};
        System.out.println(list(nums));
    }

    // space optimization code
    static int list(int nums[]){
//        int n = nums.length;
        ArrayList<Integer> sub = new ArrayList<>();
        for(int num:nums){
            int i = Collections.binarySearch(sub,num);
            if(i<0){
                i =-(i+1);
            }
            if(i <sub.size()){
                sub.set(i,num);
            }
            else{
                sub.add(num);
            }

        }
        return sub.size();
    }
}
