import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> ans = new ArrayList<>();
        for(int row = 1; row <=numRows; row++){
            ans.add(generateRow(row));
        }
        //return ans;
    }
    public static List<Integer> generateRow(int row){
        ArrayList<Integer> rowAns = new ArrayList<>();
        rowAns.add(1);
        long ans = 1;
        for(int col = 1; col < row; col++){
            ans *= row - col;
            ans /= col;
            rowAns.add((int)ans);
        }
        return rowAns;
    }
}
