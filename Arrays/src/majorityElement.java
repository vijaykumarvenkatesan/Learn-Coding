//public class majorityElement {
//    public static void main(String[] args) {
//        // The brut force will be thge use of two for loop and the each elemwnt will be
//        // search in the every element for count the frequency of it
//
//
//        // This is the better solution for the using the hashmap
//        // int n = nums.length;
//        // HashMap<Integer, Integer>  map =new HashMap<>();
//        // for(int i =0; i<n;i++){
//        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//        // }
//
//        // for(Map.Entry<Integer,Integer> it : map.entrySet()){
//        //     if(it.getValue()>n/2){
//        //         return it.getKey();
//        //     }
//        // }
//
//        // return 0;
//
//        // optimal moores algorithm
//        int[] nums = new int[8];
//        int el=0;
//        int count =0;
//
//        for(int i=0; i<nums.length;i++){
//            if(count == 0){
//                el = nums[i];
//                count++;
//            }
//            else if (el == nums[i]) count++;
//            else count--;
//        }
//        return el;
//    }
//}
