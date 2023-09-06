package problems;

public class bookAllocation {
    public static void main(String[] args) {
        int[] arr = {12,34,67,90};
        System.out.println(book(arr, 2));

    }
    static int book(int[] arr, int m){
        int ans = -1;
        int s = 0;
        int e = 0;
        for(int i=0;i<arr.length;i++){
            e += arr[i];
        }
        int mid = s + (e-s)/2;
        while(s<e){
            if(maxPage(arr,m,mid)){
                e = mid - 1;
                ans = mid;
            }
            else{
                s = mid + 1;
            }
            mid = s + (e-s)/2;
        }

        return ans;
    }
    private static boolean maxPage(int[] arr, int m, int mid) {
        int studentCount = 1;
        int pageSum=0;

        for(int i=0;i<arr.length;i++){
            if(pageSum + arr[i] <= mid){
                pageSum += arr[i];
            }
            else{
                studentCount++;
                if(studentCount>m || arr[i] > mid){
                    return false;
                }
                pageSum = arr[i];
            }
        }
        return true;
    }
    
}
