package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fourSum {
    public static void main(String[] args) {

    }

    // better approach - similar to 3Sum
    // public List<List<Integer>> fourSum(int[] nums, int target) {
    // Set<List<Integer>> res = new HashSet();

    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // Set<Long> st = new HashSet();
    // for (int k = j + 1; k < nums.length; k++) {
    // long sum = nums[i] + nums[j];
    // sum += nums[k];
    // long fourth = target - sum;
    // if (st.contains(fourth)) {
    // List<Integer> temp = new ArrayList();
    // temp.add(nums[i]);
    // temp.add(nums[j]);
    // temp.add(nums[k]);
    // temp.add((int) fourth);
    // temp.sort(null);
    // res.add(temp);
    // }
    // st.add((long) nums[k]);
    // }
    // }
    // }
    // List<List<Integer>> ans = new ArrayList(res);
    // return ans;
    // }

    //optimal approach - similar to 3-Sum 
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList();
        Arrays.sort(nums);
        int n = nums.length;

        //here i and j will be constant
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) //to check if i and i-1 elements are not duplicate
                continue;
            for (int j = i + 1; j < n; j++) {
                if (j != i + 1 && nums[j] == nums[j - 1]) //check j is not the first element, check if j and j-1 elements are not same 
                    continue;

                int k = j + 1;
                int l = n - 1;
                while (k < l) {
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if (sum < target) {
                        k++;
                    } else if (sum > target) {
                        l--;
                    } else {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        ans.add(temp);
                        k++;
                        l--;
                        while (k < l && nums[k] == nums[k - 1])
                            k++;
                        while (k < l && nums[l] == nums[l + 1])
                            l--;
                    }
                }

            }

        }
        return ans;
    }
}
