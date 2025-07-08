import java.util.Stack;

public class largestRectangleInHistogram {
    public static void main(String[] args) {
        // bruth force
        //    int n = heights.length;
        //    int[] nse = new int[n];
        //    int[] pse = new int[n];
        //    Stack<Integer> st = new Stack<>();
        //    for(int i =0; i<n;i++){
        //     while(!st.isEmpty() && heights[st.peek()]>= heights[i]) st.pop();
        //     pse[i] = st.isEmpty()?-1:st.peek();
        //     st.push(i);
        //    }
        //    st.clear();
        //    for(int i =n-1; i>-1;i--){
        //     while(!st.isEmpty() && heights[st.peek()]>= heights[i]) st.pop();
        //     nse[i] = st.isEmpty()?n:st.peek();
        //     st.push(i);
        //    }

        //     int max =0;
        //     for(int i=0; i<n;i++){
        //         max = Math.max(max,heights[i]*(nse[i]-pse[i]-1));
        //     }
        //     return max;
        int[] heights = new int[10];

        int n = heights.length;
        Stack<Integer> st = new Stack<>();
        int maxi = 0;

        for(int i =0; i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]> heights[i]){
                int element = heights[st.pop()];
                int right = i;
                int left = st.isEmpty()? -1: st.peek();
                maxi = Math.max(maxi,element*(right-left-1));
            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int right = n;
            int element = heights[st.pop()];
            int left = st.isEmpty()?-1:st.peek();
            maxi = Math.max(maxi,element*(right-left-1));
        }
//        return maxi;
    }
}
