public class maxisumSubarray {
    public static void main(String[] args) {
        int sum =0;
        int maxSum = Integer.MIN_VALUE;

        // It is kande's algorithm

        int[] nums = new int[10];
        for(int i = 0; i<nums.length; i++){
            sum += nums[i];
            if(sum > maxSum) maxSum = sum;
            if(sum <0) sum =0;
        }
//        return maxSum;
    }
}
