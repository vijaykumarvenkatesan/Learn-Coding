public class minAndMax {
    public static void main(String[] args) {
        if(arr.length>0){
            int max = arr[0], min = arr[0];
            for(int i: arr){
                if(i > max) max = i;
                if (i < min) min = i;
            }
            return new Pair(min,max);
        }
        return new Pair(-1,-1);
    }
}
