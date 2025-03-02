import java.util.*;

public class patternOddEven {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int odd=1;
        int even=2;
        for(int i=0; i<n;i++){
            for(int j=0;j<(n-i)*3;j++){
                System.out.print(" ");
            }
            for(int k=0; k<=i;k++){
                if(i%2==0) {
                    System.out.print(odd +" ");
                    odd+=2;
                }
                else{
                    System.out.print(even+" ");
                    even+=2;
                }
            }
            System.out.println();
        }
    }
}
