import java.util.*;

public class leftRotateOneplace {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       int n = in.nextInt();
       int[] arr;
       arr = new int[n];
        for(int i=0; i<n;i++) arr[i] = in.nextInt();

        int temp = arr[0];
        for(int i=1; i<n;i++) arr[i-1] = arr[i];
        arr[n-1] = temp;
        for(int i : arr) System.out.print(i+ " ");

    }
}
