package src.Recursion;

public class SubSetSum {
    public static void main(String[] args) {
        int arr[] = {10,20,30};
        int n = 3;
        int sum = 70;
        System.out.println(subsetSumProblem(arr,n,sum));
    }

    private static int subsetSumProblem(int[] arr, int n, int sum) {
        if(n==0)
            return sum == 0 ? 1 : 0 ;
        return subsetSumProblem(arr,n-1,sum)+subsetSumProblem(arr,n-1,sum-arr[n-1]);
    }
}
