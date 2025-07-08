public class _125_ValidPalindrome {
    public static void main(String[] args) {
        String s ="sjhfsbjsdshdf";
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]","");
        // if(s.length() <1) return true;
        // return ans(0,s);
    }
    public static boolean ans(int i, String s){
        if(i >= s.length() /2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return ans(i+1, s);

    }
}
