package problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class leaderArray {

    public static void main(String[] args) {
        
    }


    // Brute force approach
    // public static List<Integer> superiorElements(int[] a) {
        
    //     HashSet<Integer> ans = new HashSet<>();
    //     for (int i = 0; i < a.length; i++) {
    //         boolean leader = true;
    //         for (int j = i + 1; j < a.length; j++) {
    //             if (a[j] > a[i]) {
    //                 leader = false;
    //                 break;
    //             }
    //         }
    //         if (leader == true) {
    //             ans.add(a[i]);

    //         }
    //     }
    //     ArrayList<Integer> res = new ArrayList<>();
    //     for (int i : ans) {
    //         res.add(i);
    //     }
    //     Collections.sort(res);

    //     return res;
    // }

    //Optimal Approach
    static List<Integer> leader(int[] arr){
        
    }
}
