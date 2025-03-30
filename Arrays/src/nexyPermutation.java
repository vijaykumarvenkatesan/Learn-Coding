public class nexyPermutation {
    public static void main(String[] args) {
        int[] nums = {3,3,1,4,2,2};
        int index = -1;
        int n = nums.length;
        for(int i = n-2; i >=0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                System.out.println(i);
                break;
            }
        }
        if(index == -1){
            int i =0;
            int j = n-1;
            while(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }
        for(int i = n-1 ; i > index; i--){
            if(nums[i] > nums[index]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        int i = index+1;
        int j =n-1;
        while (i < j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}
