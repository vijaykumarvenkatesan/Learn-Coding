import java.util.HashMap;

public class sum0 {
    public static void main(String[] args) {
        HashMap<Integer,Integer> preSum = new HashMap<>();
        int max = 0;
        int sum = 0;
        int[] arr = new int[3];
        int n = arr.length;
        for(int i =0; i<n;i++){
            sum +=arr[i];
            if(sum == 0) max = Math.max(max,i+1);
            else{
                if(preSum.get(sum)!= null){
                    max = Math.max(max,i - preSum.get(sum));
                }
                else{
                    preSum.put(sum,i);
                }
            }
        }
        //return max;
    }
}
