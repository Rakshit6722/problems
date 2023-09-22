package problems;

import java.util.Arrays;

//right rotation
public class rightrotationDplaces {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d = 2;
        rightRotation(arr, d);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int low, int high){
        int temp = arr[high];
        arr[high] = arr[low];
        arr[low] = temp;
        }
    public static void reverse(int[] arr, int low, int high){
        while(low<high){
            swap(arr, low, high);
            low++;
            high--;
        }
    }
    public static void rightRotation(int[] arr, int d){
        int n = arr.length;
        d = d % n;

        reverse(arr, 0, d); // reverse starting part from 0 to d
        reverse(arr, n-d, n-1); // reverse last part from n-d to end
        reverse(arr, 0, n-1); //reverse whole array
    }
}
