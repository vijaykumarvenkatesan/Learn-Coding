//Printing the names n times using recursion

import java.util.*;
public class printName {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printn(1,n);

    }
//    public static void print(int i,int n){
//        if(i>n) return;
//        System.out.println("vijay");
//        print(i+1,n);
//    }
    public static void printn(int i, int n){
        if(i>n) return;
        System.out.println("vijay");
        printn(i,n-1);
    }
}
