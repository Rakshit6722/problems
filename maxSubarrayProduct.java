package problems;

public class maxSubarrayProduct {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        System.out.println(nums);
    }

    //Optimal approach 1 - this did not worked for 1 testcase on leetcode - [0, 10, 10, 10, 10, 10, 10, 10, 10, 10, -10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 0]
    public static int maxProduct(int[] nums) {
        int prefix = 1;
        int suffix = 1;
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = nums.length-1;

        //calculating prefix product from left
        while(left<nums.length){
            if(prefix==0) prefix = 1; //whenever prefix becomes 0 turn it back to 1;
            prefix *= nums[left];
            max = Math.max(max,prefix);
            left++;
        }

        //calculating suffix product from right
        while(right>=0){
            if(suffix==0) suffix=1;//whenever suffix becomes 0 turn it back to 1;
            suffix *= nums[right];
            max = Math.max(max,suffix);
            right--;
        }
        return max;

    }
}
