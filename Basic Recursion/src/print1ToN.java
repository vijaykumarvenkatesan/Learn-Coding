import java.util.*;
public class print1ToN {

    public static void print(int i, int n){
        if(i>n) return;
        System.out.println(i);
        print(i+1,n);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(1,n);
    }
}
