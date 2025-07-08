public class _392_isSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "adhsfbshfhcajdf";
        int sp =0;
        int tp =0;

        while(sp < s.length() && tp < t.length()){
            if(s.charAt(sp) == t.charAt(tp)) sp++;
            tp++;
        }
//        return sp == s.length();
    }
}
