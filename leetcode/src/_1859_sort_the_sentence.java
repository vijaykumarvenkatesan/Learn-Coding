import java.util.HashMap;


public class _1859_sort_the_sentence {
    public static void main(String[] args) {
        String  s = "";
        String str[] = s.split(" ");
        HashMap <Integer, String> encode = new HashMap<>();

        for(String w : str){
            int lastValue = w.charAt(w.length()-1) - '0';
            encode.put(lastValue, w.substring(0,w.length()-1));
        }

        StringBuilder word = new StringBuilder();
        for(int i=1; i<=str.length;i++){
            word.append(encode.get(i)+" ");
        }
//        return word.toString().trim();
    }
}
