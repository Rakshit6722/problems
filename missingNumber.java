package problems;

public class missingNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        System.out.println(missingNum(arr));
    }

    //brute force
    // static int missingNum(int[] arr, int n){
    //     for(int i=1;i<=n;i++){
    //         int flag = 0;
    //         for(int j=0;j<arr.length-1;j++){
    //             if(arr[j]==i){
    //                 flag = 1;
    //                 break;
    //             }
    //         }
    //         if(flag==0) return i;
    //     }
    //     return -1;
        
    // }

    //optimal soln - 1
        // static int missingNum(int[] arr){
        //     int n = arr.length;
        //     int sum = (n*(n+1))/2;
        //     int sum2 = 0;
        //     for(int i=0;i<arr.length;i++){
        //         sum2+=arr[i];
        //     }
        //     return sum - sum2;
        // }

    //optimal soln - 2 - incomplete
    //  static int missingNum(int[] arr){
    //     int n = arr.length;
    //     int XOR1 = 0;
    //     int XOR2 = 0;
        
    //     for(int i=0;i<n-1;i++){
    //         XOR2 = XOR2^arr[i];
    //         XOR1 = XOR1^(i+1);
    //     }
    //     return XOR1^XOR2;
    //  }

}
