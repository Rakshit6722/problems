package problems;

import java.util.*;

public class threeSum {
    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum(arr); // Calling the static method directly

        for (int i = 0; i < result.size(); i++) {
            List<Integer> triplet = result.get(i);
            System.out.println(triplet);
        }
    }

    // brute force approach
    // public static List<List<Integer>> threeSum(int[] nums) {
    // Set<List<Integer>> st = new HashSet<>();
    // int n = nums.length;
    // for (int i = 0; i < n; i++) {
    // for (int j = i + 1; j < n; j++) {
    // for (int k = j + 1; k < n; k++) {
    // if (nums[i] + nums[j] + nums[k] == 0) {
    // List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
    // temp.sort(null); //sorted to check for duplicates
    // st.add(temp); // to store only unique values
    // }
    // }
    // }
    // }
    // List<List<Integer>> ans = new ArrayList(st);
    // return ans;
    // }

    // better approach
    // public static List<List<Integer>> threeSum(int[] nums) {

    // Set<List<Integer>> ans = new HashSet<>(); // set which contains list of
    // integer

    // for (int i = 0; i < nums.length; i++) {
    // Set<Integer> st = new HashSet<>(); // hashset to store value of nums[j], with
    // every i iteration new hashSet is created
    // for (int j = i + 1; j < nums.length; j++) {
    // int third = -(nums[i] + nums[j]); // nums[i]+nums[j]+nums[k] = 0 -> nums[k]
    // or third = -(nums[i]+nums[j])
    // if (st.contains(third)) { // if set contains third then we found a triplet
    // List<Integer> temp = Arrays.asList(nums[i], nums[j], third); // store triplet
    // in list
    // temp.sort(null); // sort list
    // ans.add(temp); // store list in set made earlier
    // }
    // st.add(nums[j]); // add nums[j] in hashset
    // }
    // }
    // List<List<Integer>> res = new ArrayList(ans); // store ans in res List
    // return res;
    // }

    // Optimal approach - two pointer approach
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList();

        Arrays.sort(nums); //sort

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) //if nums[i] is equals to previous element then move i ahead
                continue;

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum > 0) { 
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //to check we are not taking the same elements for making triplets that we have used just now
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }
        }
        return ans;
    }
}
