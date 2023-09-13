package src.BinarySearch;

public class SqrtOfNum {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(ceilingSqrt(x));
    }

    private static int ceilingSqrt(int x) {
        int start = 1;
        int end = x;
        int ans = -1 ;
        while(start<= end){
            int mid = (start + end)/2;
           int sqrt =  mid * mid ;
           if(sqrt == x)
               return mid;
           else if(sqrt > x )
                end = mid -1 ;
            else {
                start = mid + 1;
                ans = mid;
            }
        } return ans ;
    }
}
