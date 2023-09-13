package problems;

public class rotateImage {
    public static void main(String[] args) {
        
    }
    // public static void rotate(int[][] matrix) {
    //     int n = matrix.length;
    //     int[][] ans = new int[matrix.length][matrix[0].length];

    //     //putting matrix elements in right position in new array
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             ans[j][n-1-i]=matrix[i][j];
    //         }
    //     }
    //     //putting elmenets back in matrix array
    //     for(int i=0;i<matrix.length;i++){
    //         for(int j=0;j<matrix[0].length;j++){
    //             matrix[i][j]=ans[i][j];
    //         }
    //     }
    // }

    //optimal appraoch
    public void rotate(int[][] matrix) {
        int n = matrix.length;
    
        // Transpose the matrix (swap rows and columns)
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    
        // Reverse each row of the transposed matrix
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    
}
