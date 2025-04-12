import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4_Sum {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i<n; i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j <n;j++){
                if( j != i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int l = n -1;
                while(k < l){
                    long sum =(long)nums[i] + (long)nums[j];
                    sum+= (long)nums[k];
                    sum+= (long)nums[l];
                    int target = 0;
                    if(sum == (long)target){
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                        while(k < l && nums[k] == nums[k-1]) k++;
                        while(k < l && nums[l] == nums[l+1]) l--;
                    }
                    else if(sum < target) k++;
                    else l--;
                }
            }
        }

    }
}
