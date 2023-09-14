package problems;

public class pascalsTriangle {
    public static void main(String[] args) {
        System.out.println(nthElement(4-1, 2-1 ));
    }

    //to find nth element in pascal triangle
    static int nthElement(int n, int r){
        int res = 1;
        for(int i = 0;i<r;i++){
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    }
}
