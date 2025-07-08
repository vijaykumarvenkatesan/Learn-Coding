import java.util.*;

public class maximalRectangle {
    public static void main(String[] args) {
        int matrix[][] = new int[12][12];
//        if(matrix.length == 1 && matrix[0].length == 1) return matrix[0][0]-'0';
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] preSum = new int[m][n];
        int maxRec =0;

        for(int col =0; col <n;col++){
            int sum =0;
            for(int row=0; row<m;row++){
                sum+=matrix[row][col] - '0';
                if(matrix[row][col] - '0' == 0) sum =0;
                preSum[row][col] = sum;
            }
        }
        for(int row =0; row<m;row++){
            maxRec = Math.max(maxRec,maxiHistogram(preSum[row]));
        }
//        return maxRec;

    }

    public static int maxiHistogram(int[] arr){
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int maxi =0;

        for(int i =0; i<n;i++){
            while(!st.isEmpty() && arr[i]< arr[st.peek()]){
                int element = arr[st.pop()];
                int right = i;
                int left = st.isEmpty()? -1:st.peek();
                maxi = Math.max(maxi,element*(right -left-1));

            }
            st.push(i);
        }

        while(!st.isEmpty()){
            int right = n;
            int element = arr[st.pop()];
            int left = st.isEmpty()? -1 :st.peek();
            maxi = Math.max(maxi,element*(right -left-1));
        }
        return maxi;
    }
}
