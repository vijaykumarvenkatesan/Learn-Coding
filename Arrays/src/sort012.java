public class sort012 {
    public static void swap(int a, int b,int[] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        // this will be the better approach for the problem
        // int count0=0, count1=0, count2 = 0;

        // for(int i = 0; i < nums.length; i++){
        //     if(nums[i] ==0) count0++;
        //     else if (nums[i] == 1) count1++;
        //     else count2++;
        // }

        // for(int i = 0; i<count0; i++) nums[i] = 0;
        // for(int i = count0; i < count0+count1; i++ ) nums[i] = 1;
        // for(int i = count0+count1; i < nums.length; i++) nums[i] = 2;

        // The optimal approach will be the detuch national flag algorithm

        int[] nums = new int[7];
        int low =0; int mid =0; int high = nums.length -1;
        while(mid <= high){
            if(nums[mid]==0) {
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if (nums[mid]==1) mid++;
            else{
                swap(mid,high,nums);
                high--;
            }
        }
    }
}
