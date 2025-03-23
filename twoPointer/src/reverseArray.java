import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {
        int[]  arr= {1,2,3,4,5,6};
        int lowIndex = 0;
        int highIndex =arr.length-1;
        while(lowIndex < highIndex){
            int temp = arr[lowIndex];
            arr[lowIndex] = arr[highIndex];
            arr[highIndex] = temp;
            lowIndex++;
            highIndex--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
