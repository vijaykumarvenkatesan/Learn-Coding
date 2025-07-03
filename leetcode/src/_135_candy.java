public class _135_candy {
    public static void main(String[] args) {
        int[] ratings = new int[10];
        // better
        // int n = ratings.length;
        // int[] left = new int[n];
        // left[0] =1;
        // for(int i=1; i<n;i++){
        //     if(ratings[i] > ratings[i-1]) left[i] = left[i-1]+1;
        //     else left[i] = 1;
        // }
        // int sum = Math.max(1,left[n-1]);
        // int curr =1;
        // int right =1;
        // for(int i =n-2; i>-1;i--){
        //     if(ratings[i] > ratings[i+1]){
        //         curr=right+1;
        //         right = curr;
        //     }
        //     else{
        //         curr =1;
        //         right = curr;
        //     }
        //     sum+=Math.max(left[i],curr);
        // }

        // return sum;

        // slope formula for the optimal
        int n = ratings.length;
        int sum =1;
        int i =1;
        while(i <n){
            if(ratings[i] == ratings[i-1]){
                sum+=1;
                i++;
                continue;
            }
            int peak =1;
            while(i <n && ratings[i] > ratings[i-1]){
                peak++;
                sum+=peak;
                i++;
            }
            int down =1;
            while(i<n && ratings[i]<ratings[i-1]){
                sum+=down;
                down++;
                i++;
            }
            if(peak<down) sum+=(down-peak);
        }
//        return sum;
    }
}
