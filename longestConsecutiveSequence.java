package problems;

public class longestConsecutiveSequence {

    public static void main(String[] args) {
        int arr[] = {5,8,3,2,1,4};
        System.out.println(longestSuccessiveElements(arr));
    }
    
    //brute force
    public static int longestSuccessiveElements(int []a) {
        // Write your code here.
        int longest = 1;
        for(int i=0;i<a.length;i++){
            int x = a[i];
            int count = 1;
            while(search(a,x+1)){
                x = x+1;
                count++;
            }
            longest = Math.max(longest,count);
        }
        return longest;
    }
    static boolean search(int[] arr, int num){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                return true;
            }
        }
        return false;
    }
}
