package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class meregeOverlapInterval {

    public static void main(String[] args) {
        
    }

    //brute force
    public static List<List<Integer>> merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0])); //to sort 2D array
        List<List<Integer>> ans = new ArrayList();

        for (int i = 0; i < intervals.length; i++) { //iterating every subinterval

            //assuming first interval as possible interval and moveing forward with every iteration
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) //if ans contain value && check current end element with previous interval end element
                continue;

            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] <= end) { //if first element of current interval is lesser than end element of previous interval
                    end = Math.max(end, intervals[j][1]); //then add second element of current interval in previous interval
                }

            }
            //add intervals in list
            ans.add(Arrays.asList(start, end));
        }
        return ans;

        //to return ans as a 2D array
        // int[][] result = new int[ans.size()][2];
        // for (int i = 0; i < ans.size(); i++) {
        //     result[i][0] = ans.get(i).get(0);
        //     result[i][1] = ans.get(i).get(1);
        // }
        // return result;
    }

    //Optimal approach - pending
}
