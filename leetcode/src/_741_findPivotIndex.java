public class _741_findPivotIndex {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int totalSum =0;
        for(int i:nums) totalSum+=i;

        int leftSum =0;

        for(int i=0; i<nums.length;i++){
            totalSum-=nums[i];
            if(totalSum == leftSum) // return i;
            leftSum+=nums[i];
        }
//        return -1;
    }
}
