import java.util.List;
import java.util.ArrayList;
public class _22_GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        List<String> ans = new ArrayList<>();
        generateParantheses(0,0,n,ans,"");
        for(String s:ans) System.out.println(s);
    }
    private static void generateParantheses(int openP, int closeP,int n,List<String> ans,String s){
        if(openP == closeP && openP + closeP == 2*n){
            ans.add(s);
            return;
        }
        if(openP <n){
            generateParantheses(openP+1,closeP,n,ans,s+"(");
        }
        if(closeP <openP) generateParantheses(openP,closeP+1,n,ans,s+")");
    }
}
