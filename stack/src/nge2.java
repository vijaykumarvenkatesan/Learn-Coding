import java.util.Stack;

public class nge2 {
    public static void main(String[] args) {

        // Using circular asumption we done this problem
        int[] nums = new int[10];
        Stack<Integer> mono = new Stack<>();
        int n = nums.length;
        int[] ans =new int[n];
        for(int i = (2*n)-1; i>-1;i--){
            while(!mono.isEmpty() && nums[i%n] >= mono.peek()){
                mono.pop();
            }
            if(i <n){
                ans[i] = mono.isEmpty()? -1:mono.peek();
            }
            mono.push(nums[i%n]);
        }
//        return ans;
    }
}
