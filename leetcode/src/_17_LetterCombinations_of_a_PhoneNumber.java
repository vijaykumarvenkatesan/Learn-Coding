import java.util.*;

public class _17_LetterCombinations_of_a_PhoneNumber {

    public static void main(String[] args) {
        String digits = "23";
        Map<Character, String> numberToLetter = new HashMap<>();
        List<String> ans = new ArrayList<>();

//        if(digits == null || digits.length() ==0) return ans;

        numberToLetter.put('2', "abc");
        numberToLetter.put('3', "def");
        numberToLetter.put('4', "ghi");
        numberToLetter.put('5', "jkl");
        numberToLetter.put('6', "mno");
        numberToLetter.put('7', "pqrs");
        numberToLetter.put('8', "tuv");
        numberToLetter.put('9', "wxyz");


        backtrack(digits, 0, new StringBuilder(), ans, numberToLetter);
//        return ans;
    }

    private static void backtrack(String digit, int index, StringBuilder comb, List<String> ans, Map<Character, String> numberToLetter) {
        if (index == digit.length()) {
            ans.add(comb.toString());
            return;
        }

        String letter = numberToLetter.get(digit.charAt(index));
        for (char c : letter.toCharArray()) {
            comb.append(c);
            backtrack(digit, index + 1, comb, ans, numberToLetter);
            comb.deleteCharAt(comb.length() - 1);
        }

    }
}