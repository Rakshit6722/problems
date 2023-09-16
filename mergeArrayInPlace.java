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
    // public static void merge(int[] nums1, int m, int[] nums2, int n) {
    //     int i = m; //we have to append in nums1 from mth index
    //     for (int j = 0; j < n; j++) {
    //         nums1[i++] = nums2[j]; //appending in nums1 till nums2 length starting from mth index
    //     }
    //     Arrays.sort(nums1); //sort it

    // }

    //Optimal appraoch
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        //intialize three pointers
        int p1 = m-1; //point at the last valid element of nums1
        int p2 = n-1; //point at the last valid element of nums2
        int pM = m+n-1; //point at the last available element of nums1

        while(p2>=0){
            if(p1>0 && nums1[p1]>nums2[p2]){
                nums1[pM] = nums1[p1];
                pM--;
                p1--;
            }
            else{
                nums1[pM] = nums2[p2];
                pM--;
                p2--;
            }
        }

        
    }
}
