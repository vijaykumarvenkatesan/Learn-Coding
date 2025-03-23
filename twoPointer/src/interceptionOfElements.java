import java.util.Arrays;

public class interceptionOfElements {
    public static void main(String[] args) {
        int[] arr1 = {6,12,5,10,25,21,12,34};
        int[] arr2 = {25,10,3,12,34};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int index1 = 0;
        int index2 = 0;
        while(index1 < arr1.length && index2 < arr2.length){
            if(arr1[index1] > arr2[index2] && index2 != arr2.length-1) index2++;
            else if (arr1[index1] < arr2[index2] && index1 != arr1.length-1) index1++;
            else if (arr1[index1] == arr2[index2]){
                 System.out.println(arr1[index1]);
                index1++;
                index2++;
            }
        }
    }
}
