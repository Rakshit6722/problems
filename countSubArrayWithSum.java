package problems;

public class countSubArrayWithSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(subarraySum(arr, 3));
    }
    static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                int sum = 0;
                for(int x=i;x<=j;x++){
                    sum += nums[x];
                } 
                if(sum==k){
                count++;
            } 
            }
       
        }
        return count;
    }
}
