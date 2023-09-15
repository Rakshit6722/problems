package problems;
import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(arr); // Calling the static method directly

        for (int i = 0; i < result.size(); i++) {
            List<Integer> triplet = result.get(i);
            System.out.println(triplet);
        }
    }
    

    //brute force approach
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> st = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        temp.sort(null); //sorted to check for duplicates
                        st.add(temp); // to store only unique values
                    }
                }
            }
        }
        List<List<Integer>> ans = new ArrayList(st);
        return ans;
    }
}
