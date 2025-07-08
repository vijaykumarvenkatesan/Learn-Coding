import java.util.Scanner;

public class diagonalNumberTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(1);
        for(int i=2; i<=n;i++){
            int count = i;

            for(int j=1; j<i;j++){
                count = count +(n-j);
            }
            int c = n-i+1;
            for(int j=1; j<=i;j++){
                System.out.print(count+" ");
                count = count -(c++);
            }
            System.out.println();
        }
    }
}
