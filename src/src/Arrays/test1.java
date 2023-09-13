package src.Arrays;

import java.util.ArrayList;

public class test1 {
    public static void main(String[] args) {
        int arr[] = {0,1,3,7,4};
        int x = 7;
       // System.out.println(minSumDiff(arr));
        printSubSets(arr,x);
    }

    private static void printSubSets(int[] arr, int x) {
        int sum = 0;
        int size = arr.length ;
        for(int i = 0 ; i< arr.length ; i++)
            sum += arr[i];
        boolean t[][] = new boolean[size+1][sum+1];
        for(int i = 0 ; i<sum+1 ; i++)
            t[0][i] = false;
        for(int i = 0 ; i<size+1 ; i++)
            t[i][0] = true;
        for(int i = 1 ; i < size+1 ; i++){
            for(int j =1 ; j < sum+1 ; j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j]|| t[i-1][j-arr[i-1]];
                else
                    t[i][j] = t[i-1][j];
            }
        }if(t[size][sum]==false)
            return ;
        ArrayList<Integer> ar = new ArrayList<>();
        printSubRec(arr,size-1,sum,ar);
    }

    private static void printSubRec(int[] arr, int i, int sum, ArrayList<Integer> ar) {
        boolean dp[][] = new boolean[arr.length+1][sum+1];
        if(i ==0)
        if(dp[i-1][sum]){
            ArrayList<Integer> it = new ArrayList<>();
            it.addAll(ar);
            printSubRec(arr,i-1,sum,it);
        }if(sum>=arr[i] && dp[i-1][sum-arr[i-1]]){
            ar.add(arr[i]);
            printSubRec(arr,i-1,sum-arr[i-1],ar);
        }
    }

    private static int minSumDiff(int[] arr) {
       int size = arr.length ;
       int sum = 0 ;
        for(int i = 0 ; i < size ; i++)
            sum += arr[i];
        boolean t[][] = new boolean[size+1][sum+1];
        for(int i = 0 ; i < sum+1 ; i++)
            t[0][i] = false;
        for(int j = 0 ; j<size+1 ; j++)
            t[j][0] = true;
        for(int i = 1 ; i < size+1 ; i++){
            for(int j = 1 ; j <sum+1 ; j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                else{
                    t[i][j] = t[i-1][j];
                }
            }
        }
        int diff = Integer.MAX_VALUE;
        for(int i = sum/2 ; i >= 0 ; i--){
            if(t[size][i]==true){
               diff = sum - 2*i;
               break;
            }
        }return diff;
    }
}
