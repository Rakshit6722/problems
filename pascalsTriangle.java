package problems;

import java.util.ArrayList;
import java.util.List;

public class pascalsTriangle {
    public static void main(String[] args) {
        System.out.println(nthElement(4 - 1, 2 - 1));
        nthRow(4);
        System.out.println();
        System.out.println(generate(5));
    }

    // to find nth element in pascal triangle
    static int nthElement(int n, int r) {
        int res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    // to print nth row
    static void nthRow(int n) {
        int ans = 1;
        System.out.print(ans + " ");
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans /= i;
            System.out.print(ans + " ");
        }
    }

    // return whole triangle in a list
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 1; i <= numRows; i++) {
            ans.add(generateRow(i));
        }
        return ans;
    }

    static List<Integer> generateRow(int row) {
        List<Integer> temp = new ArrayList<>();
        int ans = 1;
        temp.add(1);
        for (int i = 1; i < row; i++) {
            ans = ans * (row - i);
            ans /= i;
            temp.add(ans);
        }
        return temp;
    }
}
