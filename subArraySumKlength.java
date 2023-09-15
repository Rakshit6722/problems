package problems;

public class subArraySumKlength {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 1, 1, 1, 1 };
        System.out.println(subArray(arr, 3));
    }

    // brute force
    // static int subArray(int[] arr, int l) {
    // int len = 0;
    // for (int i = 0; i < arr.length; i++) {
    // for (int j = i; j < arr.length; j++) {
    // int sum = 0;

    // sum += arr[j];
    // if (sum == l) {
    // len = Math.max(len, j - i + 1);

    // }
    // }
    // }
    // return len;
    // }

    // optimal soln
    static int subArray(int[] arr, int k) {

        //intial sum as we only have one element so its sum will the element itself
        int sum = arr[0];

        //intial len
        int len = 0;

        //two pointers both on 0 index
        int right = 0;
        int left = 0;

        //till right is lesser than array length
        while (right < arr.length) {
            while (left<=right && sum > k) { //if sum increases we need to trim the array
                sum -= arr[left]; //decrease the array by arr[left] elemetn
                left++;           //increment left
            }
            if(sum==k){ //if sum == k find max len
                len = Math.max(len,right-left+1);
            }
            right++; //increment right
            if (right < arr.length)
                sum += arr[right]; //keep adding right in sum

        }
        return len;
    }
}
