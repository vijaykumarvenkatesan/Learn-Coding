import java.util.ArrayList;
import java.util.PriorityQueue;

public class kLargestElements {
    public static void main(String[] args){
        public ArrayList<Integer> kLargest(int[] arr, int k) {
            // Your code here

            PriorityQueue <Integer> pq = new PriorityQueue<>();
            for(int i : arr){
                pq.add(i);
                if(pq.size()>k) pq.poll();
            }
            ArrayList <Integer> ans = new ArrayList<>(pq);
            ans.sort((a,b)-> b-a);
            return ans;
    }
}
