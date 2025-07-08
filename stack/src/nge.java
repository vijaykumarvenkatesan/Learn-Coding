import java.util.*;

public class nge {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int[] ans = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for(int i =arr.length-1; i>=0; i--){

            while(!st.isEmpty() && arr[i] >= st.peek()) st.pop();
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }
        ArrayList<Integer> nge = new ArrayList<>();
        for(int i:ans){
            nge.add(i);
        }
//        return nge;
    }
}
    