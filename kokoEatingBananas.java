package problems;

public class kokoEatingBananas {
    public static void main(String[] args) {
        int[] pile = {3,6,7,11};
        System.out.println(minBan(pile, 8));
        
    }
    static int minBan(int[] arr, int h){
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int low = 1;
        int high = max;

        int ans = 0;

        int mid = low + (high-low)/ 2;

        while(low<=high){
            if(time(arr,mid)<=h){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1; 
            }
            mid = low + (high-low)/ 2;
        }
        return ans;

    }
    private static int time(int[] arr, int mid) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += Math.ceil((double)arr[i] / mid);
        }
        return sum;
    }
}
