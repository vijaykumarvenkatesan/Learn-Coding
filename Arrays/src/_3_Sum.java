import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3_Sum {
    public static void main(String[] args) {
        int[] nums = new int[8];
        int n =7;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i< n;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum > 0){
                    k--;
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));
                    ans.add(temp);
                    k--;
                    j++;
                    while(nums[k] == nums[k+1] && j < k) k--;
                    while(nums[j] == nums[j-1] && j < k) j++;
                }
            }
        }
//        return ans;
    }
}
