public class Two_DarrayDp {
    static int recursion(int[][] arr, int i, int j, int n){
        if(i == n) return arr[n][j];
        int d = arr[i][j]+ recursion(arr,i+1,j,n);
        int dia = arr[i][j]+recursion(arr,i+1,j+1,n);
        return Math.max(d,dia);
    }

    public static void main(String[] args) {
        int arr[][] = {{7},
                {8,5},
                {6,5,4},
                {10,25,65,100}};
        System.out.println(recursion(arr,0,0,arr.length-1));
    }
}
// The question is for calculating the sum diagonally and vertically in every iterate