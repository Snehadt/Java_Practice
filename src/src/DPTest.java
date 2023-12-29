package src;

public class DPTest {
    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubarraySum(nums));
    }

    private static int maxSubarraySum(int[] n) {
        int sum = 0;
        int prev = Integer.MIN_VALUE;
        int j = 0;
        int i = 0;
        while(j < n.length){

            sum = sum + n[j];
            j++;
            if(prev > sum) {
                sum = sum - n[i];
                i++;
                j++;
            }else if(prev < sum)
                j++;
            prev = sum;

        }return sum;
    }
}
