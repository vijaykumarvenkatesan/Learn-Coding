import java.util.HashSet;
public class longestSequence {
    public static void main(String[] args) {
        // brute
        //     int longest = 1;
        //     int count;
        //     if(nums.length == 0) return 0;
        //     for(int i =0; i<nums.length; i++){
        //         count =1;
        //         int x = nums[i];
        //         while(ls(nums,x+1)){
        //             count++;
        //             x+=1;
        //         }
        //         longest = Math.max(longest,count);
        //     }
        //     return longest;
        // }
        // public boolean ls(int[] arr, int val){
        //     for(int i = 0; i < arr.length; i++){
        //         if(arr[i] == val) return true;
        //     }
        //     return false;

        // optimal sort it and then check the element

        // Arrays.sort(nums);
        // int last = Integer.MAX_VALUE;
        // int count = 0;
        // int longest = 0;

        // for(int i : nums){
        //     if(i-1 == last){
        //         count++;
        //         last = i;
        //     }
        //     else if(i != last){
        //         last = i;
        //         count = 1;
        //     }
        //     longest = Math.max(longest, count);
        // }
        //     return longest;

        // optimal
        int[] nums = new int[1000];
        int n = nums.length;
       // if(n == 0) return 0;
        HashSet <Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        int longest =1;
        for(int i : set){
            if(!set.contains(i-1)){
                int x = i;
                int count = 1;
                while(set.contains(x+1)){
                    count++;
                    x+=1;
                }
                longest = Math.max(count,longest);

            }
        }
        // return longest;
    }
}
