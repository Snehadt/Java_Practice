package src.Arrays;

public class LargestContiguousArraySum {
    public static void main(String[] args) {
        int n[] = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(largestSubArray(n));
    }

    private static int largestSubArray(int[] n) {
        int sum = 0 ;
        int pointer = 0 ;
        for(int i = 0 ; i < n.length ; i++){
          pointer = pointer + n[i];
          if(sum < pointer)
              sum = pointer ;
          if(pointer < 0)
              pointer = 0;
        } return sum ;
    }

}
