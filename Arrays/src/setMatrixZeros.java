public class setMatrixZeros {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int n = matrix.length;
        int m = matrix[0].length;
        // int[] row = new int[n];
        // int[] col = new int[m];

        // Arrays.fill(row,0);
        // Arrays.fill(col,0);

        // for(int i =0; i<n; i++){
        //     for(int j=0; j < m; j++){
        //         if(matrix[i][j] == 0){
        //             row[i] = 1;
        //             col[j] = 1;
        //         }
        //     }
        // }


        // for(int i =0; i<n; i++){
        //     for(int j=0; j < m; j++){
        //         if(row[i] == 1 || col[j] == 1) matrix[i][j] = 0;
        //     }
        // }

        // optimal instead of using extra space we using the first row and col of that to hash the values
        int col0 = 1;
        for(int i = 0; i < n ;i++){
            for(int j =0; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j!=0){
                        matrix[0][j] = 0;
                    }
                    else col0 = 0;
                }
            }
        }
        for(int i =1; i<n; i++){
            for(int j =1; j<m; j++){
                if(matrix[i][j] != 0){
                    if(matrix[0][j] == 0 || matrix[i][0] == 0) matrix[i][j] = 0;
                }
            }
        }

        if(matrix[0][0] == 0) {
            for(int j = 0; j<m; j++) matrix[0][j] = 0;
        }
        if(col0 == 0){
            for(int i = 0; i<n;i++) matrix[i][0] = 0;
        }
    }
}
