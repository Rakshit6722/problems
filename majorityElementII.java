package problems;

import java.util.ArrayList;
import java.util.List;

public class majorityElementII {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }

    //brute force
    public static List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (ans.size() == 0 || ans.get(0) != nums[i]) {
                count = 0;
                for (int j = 0; j < n; j++) {
                    if (nums[i] == nums[j]) {
                        count++;
                    }
                }
                if (count > n / 3) {
                    ans.add(nums[i]);

                }

            }
            if (ans.size() == 2)
                break;

        }
        return ans;
    }

    //optimal approach - pending

}
