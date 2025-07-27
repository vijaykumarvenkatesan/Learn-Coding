public class _1248CountNumber_ofNiceSubarrays {
    public static void main(String[] args) {
        int[] nums ={1,2};
        int k=2;
//        return compute(nums,k) -compute(nums,k-1);
    }
    private static int compute(int[] nums, int k){
        int l=0,r=0,sum=0,cnt=0;

        while(r < nums.length){
            sum+=nums[r]%2;
            while(sum >k){
                sum-=nums[l]%2;
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}
