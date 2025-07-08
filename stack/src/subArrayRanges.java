import java.util.Stack;

public class subArrayRanges {
    public static void main(String[] args) {
        int[] nums = new int[10];
        int n = nums.length;
        int[] pse = new int[n];
        int[] nse = new int[n];
        int[] ple = new int[n];
        int[] nle = new int[n];

        Stack<Integer> st = new Stack<>();
        for(int i =0; i<n;i++){
            while(!st.isEmpty() && nums[i]<=nums[st.peek()]) st.pop();
            pse[i] = st.isEmpty()? -1 :st.peek();
            st.push(i);
        }
        st.clear();

        for(int i =0; i<n;i++){
            while(!st.isEmpty() && nums[i]>=nums[st.peek()]) st.pop();
            ple[i] = st.isEmpty()? -1 :st.peek();
            st.push(i);
        }
        st.clear();

        for(int i =n-1; i>-1;i--){
            while(!st.isEmpty() && nums[i]<nums[st.peek()]) st.pop();
            nse[i] = st.isEmpty()? n :st.peek();
            st.push(i);
        }
        st.clear();

        for(int i =n-1; i>-1;i--){
            while(!st.isEmpty() && nums[i]>nums[st.peek()]) st.pop();
            nle[i] = st.isEmpty()? n :st.peek();
            st.push(i);
        }


        long ans =0;
        for(int i =0; i<n;i++){
            long max = (long)((i-ple[i])*(nle[i]-i));
            long min = (long)((i-pse[i])*(nse[i]-i));
            ans+=(max - min)*nums[i];
        }
//        return ans;
    }
}
