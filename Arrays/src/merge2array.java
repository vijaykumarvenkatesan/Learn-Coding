import java.util.*;

public class merge2array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.out.println("Enter only the sorted array ");
        for(int i =0; i<n;i++){
            arr1[i] = in.nextInt();
        }
        for(int i =0; i<m;i++){
            arr2[i] = in.nextInt();
        }
        int[] arr3 = new int[n+m];
        int i = 0;
        int j = 0;
        int index =0;
        while(i <n && j <m){
            if(arr1[i] <= arr2[j]){
                arr3[index++] = arr1[i++];
            }
            else{
                arr3[index++] = arr2[j++];
            }
        }
        while(i < n){
            arr3[index++] = arr1[i++];
        }

        while(j < m){
            arr3[index++] = arr2[j++];
        }

        for(int k=0; k<arr3.length;k++){
            if(k < n) arr1[k] = arr3[k];
            else arr2[k-i] = arr3[k];
        }
        System.out.println(arr3);
    }
}
