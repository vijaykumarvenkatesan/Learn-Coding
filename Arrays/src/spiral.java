import java.util.ArrayList;

public class spiral {
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[][] matrix = new int[3][2];
        int n = matrix.length;
        int m = matrix[0].length;
        int left =0,top = 0;
        int right = m-1,bottom = n-1;

        while(top <= bottom && left <= right){

            for(int i = left; i <=right; i++){
                ans.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
         //return ans;
    }
}
