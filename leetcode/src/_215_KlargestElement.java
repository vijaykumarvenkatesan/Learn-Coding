import java.util.PriorityQueue;
import java.util.*;

public class _215_KlargestElement {
    public static void main(String[] args) {
        
        // This is solved using sorting
        // Arrays.sort(nums);
        // return nums[nums.length-k];

        // without using sort by using the priorityqueque(heap)

        PriorityQueue<Integer> topEl = new PriorityQueue<>(Comparator.reverseOrder());
        int[] nums = new int[10];
        for(int el :nums){
            topEl.add(el);
        }
        int maxEl = 0;

        int k =3;
        while(k-->0) maxEl = topEl.poll();
//        return maxEl;
    }
}
