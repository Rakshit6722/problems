package problems;

public class rainwater {
    public static void main(String[] args) {
       int arr[] = {3,1,2,4,0,1,3,2};

       int left[] = new int[arr.length];
       int right[] = new int[arr.length];

       //for left comparison array
       left[0] = arr[0];
       for(int i=1;i<arr.length;i++){
        left[i] = Math.max(left[i-1], arr[i]);
       }

       //for right comparison array
       right[arr.length-1] = arr[arr.length-1];
       for(int i = arr.length-2;i>=0;i--){
        right[i] = Math.max(right[i+1], arr[i]);
       }

       //final answer
       int ans = 0;
       for(int i=0;i<arr.length;i++){
        ans+=(Math.min(left[i], right[i])-arr[i]);
       }

       System.out.println(ans);
    }
}
