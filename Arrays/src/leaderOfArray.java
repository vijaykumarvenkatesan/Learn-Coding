import java.util.ArrayList;
import java.util.Collections;

public class leaderOfArray {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int[] arr = {4,2,6,2};
        for(int i = arr.length-1; i>=0; i--){
            if(arr[i] >= max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        ans.sort(Collections.reverseOrder());
        //return ans;

    }
}
