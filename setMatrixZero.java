package problems;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {
            {1,1,1},
            {1,0,1},
            {1,1,1} };
        setZeroes(arr);
        
    }


    //brute force
    // public static void setZeroes(int[][] matrix) {
    //     for(int i=0;i<matrix.length;i++){
    //       for(int j=0;j<matrix[0].length;j++){
    //         if(matrix[i][j]==0){
    //           row(matrix,i);
    //           col(matrix,j);
    //         }
    //       }
    //     }
    //     for(int i=0;i<matrix.length;i++){
    //       for(int j=0;j<matrix[0].length;j++){
    //         if(matrix[i][j]==-1){
    //           matrix[i][j]=0;
    //         }
    //       }
    //     }
    // }
    // static void row(int arr[][], int num){
    //   for(int j=0;j<arr[0].length;j++){
    //     if(arr[num][j]!=0){
    //       arr[num][j]=-1;
    //     }
    //   }
    // }
    // static void col(int arr[][], int num){
    //   for(int i=0;i<arr.length;i++){
    //     if(arr[i][num]!=0){
    //       arr[i][num]=-1;
    //     }
    //   }
    // }

    //better approach
    public static void setZeroes(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int row[] = new int[n];
       
        int col[] = new int[m];
        
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
            if(matrix[i][j]==0){
              row[i] = 1;
              col [j] = 1;
            }
          }
        }
        for(int i=0;i<matrix.length;i++){
          for(int j=0;j<matrix[0].length;j++){
            if(row[i]==1 || col[j]==1){
              matrix[i][j]=0;
            }
          }
        }
    }
}
