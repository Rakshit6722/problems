package problems;

public class rotateImage {
    public static void main(String[] args) {
        
    }
    public static void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[matrix.length][matrix[0].length];

        //putting matrix elements in right position in new array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                ans[j][n-1-i]=matrix[i][j];
            }
        }
        //putting elmenets back in matrix array
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=ans[i][j];
            }
        }
    }
}
