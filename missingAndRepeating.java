package problems;

public class missingAndRepeating {
    public static void main(String[] args) {

    }


    //brute force
    public static int[] findMissingRepeatingNumbers(int[] a) {
       
        int n = a.length;

        int count = 0;
        int missing = -1;
        int repeating = -1;

        for (int i = 1; i <= n; i++) { //iterating from 1 to a.length
            count = 0;
            for (int j = 0; j < n; j++) {
                if (i == a[j]) { //if you find element of a same as i -> count++
                    count++;
                }

            }
            if (count == 2) { //if count==2 you have found your repeating number
                repeating = i;

            } else if (count == 0) {//if throughout the iteration you do not find the number in you arr then that is your missing element
                missing = i;

            }
            if (missing != -1 && repeating != -1) {//if your missing and repeating have the values now then break throught the array
                break;
            }
        }
        int[] ans = { repeating, missing };

        return ans;
    }
}
