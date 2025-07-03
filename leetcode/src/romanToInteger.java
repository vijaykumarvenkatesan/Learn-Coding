public class romanToInteger {
    public static void main(String[] args) {
        String s ="VII";
        int val =0;

        for(int i=0; i<s.length();i++){
            int r1 = getRomanValue(s.charAt(i));

            if(i+1 < s.length()){
                int r2 = getRomanValue(s.charAt(i+1));
                if(r1 >=r2) val+=r1;
                else {
                    val += (r2-r1);
                    i++;
                }
            }
            else val += r1;
        }
//        return val;

    }
    public static int getRomanValue(char c){
        if(c == 'I') return 1;
        else if(c == 'V') return 5;
        else if(c == 'X') return 10;
        else if(c == 'L') return 50;
        else if(c == 'C') return 100;
        else if(c == 'D') return 500;
        else return 1000;
    }
}
