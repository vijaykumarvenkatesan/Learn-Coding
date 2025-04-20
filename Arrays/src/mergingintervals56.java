import java.util.*;
import java.util.Comparator;

public class mergingintervals56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                return a[0] - b[0];
            }
        });
        int n = intervals.length;
        List<List<Integer>> ans = new ArrayList<>();
        // for(int i = 0; i<n; i++){
        //     int start = intervals[i][0];
        //     int end = intervals[i][1];
        //     if(!ans.isEmpty() && end <= ans.get(ans.size()-1).get(1)) continue;
        //     for(int j =i+1; j < n; j++){
        //         if(intervals[j][0]<= end){
        //             end = Math.max(end,intervals[j][1]);
        //         }
        //         else{
        //             break;
        //         }
        //     }
        //     ans.add(Arrays.asList(start,end));
        // }

        for(int i =0; i<n;i++){
            if(ans.isEmpty() || ans.get(ans.size()-1).get(1)<intervals[i][0]){
                ans.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
            else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            }
        }

        int row = ans.size();
        int col = ans.get(0).size();
        int[][] anss = new int[row][col];
        for(int i = 0; i<row;i++){
            for(int j =0; j<col;j++){
                anss[i][j] = ans.get(i).get(j);
            }
        }
        return anss;
    }
}
