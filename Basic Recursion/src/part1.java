public class part1 {
    public static void main(String[] args){
        test();
    }
    static int counter =0;
    public static void test(){
        if (counter ==3) return;
        System.out.println(counter);
        counter++;
        test();
    }
}
