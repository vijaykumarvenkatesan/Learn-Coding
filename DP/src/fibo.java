public class fibo {
    static int fibo_normal(int n){
        if(n <=1) return n;
        return fibo_normal(n-1) + fibo_normal(n-2);

    }

}
