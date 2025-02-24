import java.net.SocketTimeoutException;
import java.util.*;
public class addTwo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i=0;i<n;i++){
            arr1[i] = in.nextInt();
        }
        for(int i=0;i<m;i++){
            arr2[i] = in.nextInt();
        }
        int ans = add(arr1,arr2);
        System.out.print(ans);
    }

    public static int  add(int[] a, int[] b){
        int num1=0,num2=0;
        for(int i=a.length-1; i>=0; i--){
            num1 *=10;
            num1+=a[i];
        }
        System.out.println(num1);

        for(int i=b.length-1; i>=0; i--){
            num2 *=10;
            num2+=b[i];
        }
        System.out.println(num2);
        return num1+num2;

    }
}
