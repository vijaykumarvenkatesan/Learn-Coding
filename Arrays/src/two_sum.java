import java.util.HashMap;

public class two_sum {
    public static void main(String[] args) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++)
        // {
        //     int cur = nums[i];
        //     int x= target- cur;
        //     if(map.containsKey(x))
        //     {
        //         return new int[]{ map.get(x),i};
        //     }
        //     map.put(cur, i);
        // }
        // return null;

        // This is the better solution for the question
        // The brut will be the n2 using the two for loop comapring the two
        int[] nums = new int[8];
        int target=2;
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int i =0 ;i<nums.length; i++){
            int x = target - nums[i];
            if(map.containsKey(x)){
//                return new int[]{map.get(x),i};
            }
            map.put(nums[i],i);
        }
//        return null;
    }
}
