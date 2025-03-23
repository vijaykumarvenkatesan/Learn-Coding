import java.util.Arrays;
public class kThLargestElement {
    public static void main(String[] args) {

        int[] nums = new int[8];
        int k =3;
        Arrays.sort(nums);
        System.out.println( nums[nums.length-k]);
    }
}
