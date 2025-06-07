import java.util.*;
public class infixToPostfix {
    public static String infixToPostfix(String s) {
        // code here
        Stack<Character> open = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)) ans.append(c);
            else if(c == '(') open.push(c);
            else if(c == ')'){
                while(!open.isEmpty() && open.peek() != '('){
                    ans.append(open.pop());
                }
                open.pop();
            }
            else{
                while(!open.isEmpty() && precedence(c) <= precedence(open.peek())){
                    ans.append(open.pop());
                }
                open.push(c);
            }


        }
        while(!open.isEmpty()){
            ans.append(open.pop());
        }
        return ans.toString();

    }
    public static int precedence(char c){
        if(c == '^') return 3;
        else if(c == '/'|| c == '*'|| c == '%') return 2;
        else if(c == '+' || c == '-') return 1;
        else return -1;
    }

    public static void main(String[] args) {
        System.out.println(infixToPostfix("a+b"));
    }
}
