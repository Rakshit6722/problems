package problems;
import java.util.*;


public class countInversions {

    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        System.out.println(mergeSort(arr, 0, arr.length-1));

    }


    //approach is same as reverse paris, only condition is different

    public static void merge(int[] nums, int low, int mid, int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left<=mid && right<=high){
            if(nums[left]<nums[right]){
                temp.add(nums[left]);
                left++;
            }
            else{
                temp.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            temp.add(nums[left]);
            left++;
        }
        while(right<=high){
            temp.add(nums[right]);
            right++;
        }

        for(int i=low;i<=high;i++){
            nums[i] = temp.get(i-low);
        }


    }

    public static int countPairs(int[] nums, int low, int mid, int high){
        int count = 0;
        int right = mid+1;

        for(int i=low;i<=mid;i++){
            while(right<=high && nums[i]>nums[right]) right++;
            count = count + (right - (mid+1));
        }
        return count;
    }

    public static int mergeSort(int[] nums, int low, int high){
        int count = 0;
        if(low>=high) return count;
        int mid = low + (high - low)/2;
        count+= mergeSort(nums,low, mid);
        count+=mergeSort(nums,mid+1,high);
        count+=countPairs(nums,low,mid,high);
        merge(nums,low,mid,high);
        return count;
    }
    public static int numberOfInversions(int []a, int n) {
        // Write your code here.
        return mergeSort(a, 0, n-1 );

    }
}

