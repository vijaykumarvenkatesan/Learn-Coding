//import java.util.ArrayList
//import java.util.List;
//public class majorityElementNby3 {
//    public static void main(String[] args) {
//        int cnt1 =0;
//        int cnt2 = 0;
//        int el1 = Integer.MIN_VALUE;
//        int el2 = Integer.MIN_VALUE;
//        int[] nums = new int[10];
//        int n = nums.length;
//        for(int i =0; i<n;i++){
//            if(cnt1 == 0 && nums[i]!= el2){
//                el1 = nums[i];
//                cnt1++;
//            }
//            else if(cnt2 == 0 && nums[i]!= el1){
//                el2 = nums[i];
//                cnt2++;
//            }
//            else if(nums[i] == el1) cnt1++;
//            else if(nums[i] == el2) cnt2++;
//            else{
//                cnt1--;
//                cnt2--;
//            }
//        }
//        List <Integer> ans = new ArrayList<>();
//        cnt1 = 0;
//        cnt2 = 0;
//        for(int i : nums){
//            if(i == el1) cnt1++;
//            if(i == el2) cnt2++;
//        }
//        if(cnt1 > n/3) ans.add(el1);
//        if(cnt2 > n/3) ans.add(el2);
////        return ans;
//    }
//}
