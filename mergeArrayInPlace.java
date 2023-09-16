package problems;

import java.util.Arrays;

public class mergeArrayInPlace {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    //better approach 
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m; //we have to append in nums1 from mth index
        for (int j = 0; j < n; j++) {
            nums1[i++] = nums2[j]; //appending in nums1 till nums2 length starting from mth index
        }
        Arrays.sort(nums1); //sort it

    }
}
