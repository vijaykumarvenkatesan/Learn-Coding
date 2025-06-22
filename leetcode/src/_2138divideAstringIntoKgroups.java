public class divideAstringIntoKgroups {
    public static void main(String[] args) {
        String s = "abcs";
        int k =3;
        
        int n = s.length()%k!=0? (s.length()/k)+1 : s.length()/k;
        String[] ans = new String[n];
        for(int i=0; i<n;i++){
            if(i <n-1) ans[i] = s.substring(i*k,(i*k)+k);
            else ans[i] = s.substring(i*k);
        }
        if(s.length()%k!=0){
            int rem = k - s.length()%k;
            System.out.println(rem);
            StringBuilder sb = new StringBuilder(ans[n-1]);
            while(rem-->0) sb.append(fill);
            ans[n-1] = sb.toString();
        }


        return ans;
    }
}
