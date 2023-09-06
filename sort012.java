package problems;

import java.util.Arrays;

public class sort012 {
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,0,2};
        // sort(arr);
        sortDutchAlgo(arr);
        System.out.println(Arrays.toString(arr));
    }

    //better approach
    static void sort(int[] arr){
        int count0=0, count1=0, count2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count0++;
            if(arr[i]==1) count1++;
            if(arr[i]==2) count2++;
        }
        for(int i=0;i<count0;i++){
            arr[i] = 0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i] = 1;
        }
        for(int i=count0+count1;i<arr.length;i++){
            arr[i] = 2;
        }

    }

    //optimal soln - Dutch flag algo
    static void sortDutchAlgo(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int mid = 0;

        while(mid<=high){
            if(arr[mid]==0){
                swap(arr[mid], arr[low]);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                swap(arr[high], arr[mid]);
                high--;
            }
        }
    }
    static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
