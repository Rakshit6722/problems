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
        int sum = arr[0];
        int len = 0;
        int right = 0;
        int left = 0;

        while (right < arr.length) {
            while (left<=right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if(sum==k){
                len = Math.max(len,right-left+1);
            }
            right++;
            if (right < arr.length)
                sum += arr[right];

        }
        return len;
    }
}
