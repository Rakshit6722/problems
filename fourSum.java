package problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class fourSum {
    public static void main(String[] args) {

    }

    //brute force - similar to 3Sum
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                Set<Long> st = new HashSet();
                for (int k = j + 1; k < nums.length; k++) {
                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    long fourth = target - sum;
                    if (st.contains(fourth)) {
                        List<Integer> temp = new ArrayList();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add((int) fourth);
                        temp.sort(null);
                        res.add(temp);
                    }
                    st.add((long) nums[k]);
                }
            }
        }
        List<List<Integer>> ans = new ArrayList(res);
        return ans;
    }
}
