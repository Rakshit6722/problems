package problems;

import java.util.ArrayList;

public class reversePairs {

    public static void main(String[] args) {
        int arr[] = { 1, 3, 2, 3, 1 };
        System.out.println(mergeSort(arr, 0, arr.length - 1));
    }


    //optimal approach - we use merge sort to break array into two parts and then compare each component of one part to other  component of anotehr part
    public static void merge(int[] nums, int l, int mid, int r) {
        ArrayList<Integer> temp = new ArrayList<>();

        int left = l;
        int right = mid + 1;

        while (left <= mid && right <= r) {
            if (nums[left] <= nums[right]) {
                temp.add(nums[left]);
                left++;
            } else {
                temp.add(nums[right]);
                right++;
            }
        }
        while (left <= mid) {
            temp.add(nums[left]);
            left++;
        }
        while (right <= r) {
            temp.add(nums[right]);
            right++;
        }

        for (int i = l; i <= r; i++) {
            nums[i] = temp.get(i - l);
        }

    }

    //function to count pairs
    public static int countPairs(int[] nums, int l, int mid, int r) {
        int count = 0;
        int right = mid + 1;

        for (int i = l; i <= mid; i++) { //will run from 0 to end which is mid of left part array
            while (right <= r && (long) nums[i] > 2L * nums[right])//comparing left array element with every element of right array and also checking whether right pointer is within the right array
                right++; //if cond. is true then increment right;
            count = count + (right - (mid + 1)); //count no of pairs
        }
        return count;
    }

    public static int mergeSort(int[] nums, int l, int r) {
        int count = 0;
        if (l >= r)
            return count;
        int mid = l + (r - l) / 2;

        //storing count value from each part of mergeSort function calls
        count += mergeSort(nums, l, mid);//left part
        count += mergeSort(nums, mid + 1, r);//right part
        count += countPairs(nums, l, mid, r);//current
        merge(nums, l, mid, r);
        return count;
    }

    public int reversePairs(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);

    }

}
