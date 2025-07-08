public class _167_TwoSum_II_InputArrayIsSorted {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        int target = 10;
        int left =0;
        int right =numbers.length-1;
        while(left < right){
            int total = numbers[left] + numbers[right];

            // if(total == target) return new int[]{left+1,right+1};
           // else if(total > target) right--;
           // else left++;
        }
//        return new int[]{-1,-1};
    }
}
