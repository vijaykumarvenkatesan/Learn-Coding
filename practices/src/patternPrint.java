public class patternPrint {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        reverseSpiral(matrix);
    }

    public static void reverseSpiral(int[][] mat) {
        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        int total = mat.length * mat[0].length;
        int[] result = new int[total];
        int idx = 0;

        while (top <= bottom && left <= right) {
            // Left to Right
            for (int i = left; i <= right; i++)
                result[idx++] = mat[top][i];
            top++;

            // Top to Bottom
            for (int i = top; i <= bottom; i++)
                result[idx++] = mat[i][right];
            right--;

            // Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    result[idx++] = mat[bottom][i];
                bottom--;
            }

            // Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    result[idx++] = mat[i][left];
                left++;
            }
        }

        // Print in reverse
        for (int i = total - 1; i >= 0; i--)
            System.out.print(result[i]);
    }
}
