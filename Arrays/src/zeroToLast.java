public class zeroToLast {
    public static void main(String[] args) {
        int[] nums = new int[6];
        int i=-1;
        for(int k=0; k<nums.length; k++){
            if(nums[k]==0){
                i=k;
                break;
            }
        }
        if(i!=-1){
            for(int j=i+1; j<nums.length;j++){
                if(nums[j]!=0){
                    nums[j] = nums[j]+nums[i];
                    nums[i] = nums[j]-nums[i];
                    nums[j] = nums[j]-nums[i];
                    i++;
                }
            }
        }
    }
}
