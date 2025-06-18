import java.util.Stack;
public class sumSubarraymini {
    public static void main(String[] args) {
        int[] arr = new int[7];
        int[] nse = findNse(arr);
        int[] psee = findPse(arr);
        int mod = (int) 1e9 + 7;
        long sum = 0;
        for(int i =0; i<arr.length;i++){
            int left = i - psee[i];
            int right = nse[i] - i;

            sum += (long)(left * right)* arr[i];
            sum%=mod;
        }
//        return (int) sum;
    }
    public static int[]findNse(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] nse = new int[n];
        for(int i = n-1; i>-1;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]) st.pop();
            nse[i] = st.isEmpty()? n : st.peek();
            st.push(i);
        }
        return nse;

    }
    public static int[]findPse(int[] arr){
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];
        for(int i =0; i<n;i++){
            while(!st.isEmpty()&& arr[i]<arr[st.peek()]) st.pop();
            pse[i] = st.isEmpty()? -1 : st.peek();
            st.push(i);
        }
        return pse;
    }
}
