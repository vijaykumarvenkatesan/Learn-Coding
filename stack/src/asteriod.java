import java.util.*;
public class asteriod {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        int[] asteroids = new int[10];
        for(int i: asteroids){
            if(i > 0) st.push(i);
            else{
                while(!st.isEmpty() && st.peek()>0 && st.peek() < Math.abs(i)) st.pop();
                if(st.isEmpty() || st.peek()<0) st.push(i);
                else if(st.peek() == Math.abs(i)) st.pop();
            }
        }
        int[] ans = new int[st.size()];
        int i = st.size()-1;

        while(!st.isEmpty()){
            ans[i--] = st.pop();
        }
//        return ans;
    }
}
