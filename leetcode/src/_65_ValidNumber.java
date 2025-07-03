public class _65_ValidNumber {
    public static void main(String[] args) {
        String s ="123";
        boolean isdot = false, ise = false, isnum = false;

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)) isnum = true;
            else if(c == '+' || c == '-') {
                if(i >0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E') System.out.println(false);
            }
            else if(c == 'e' || c == 'E'){
                if(ise || !isnum) System.out.println(false);
                ise = true;
                isnum = false;
            }
            else if(c == '.'){
                if(isdot || ise) System.out.println(false); ;
                isdot = true;
            }
            else System.out.println(false); ;
        }
       // return isnum;
    }
}
