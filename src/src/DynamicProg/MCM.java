package src.DynamicProg;

import java.util.Arrays;

public class MCM {

    static int t[][] = new int[100][100];
    public static void main(String[] args) {
        int[] arr = {40,20,30,10,30};
        int size = arr.length;
       for(int[] row : t)
           Arrays.fill(row,-1);
        System.out.println(matrixMultiplication(arr,size));


    }

    private static int matrixMultiplication(int[] arr, int N) {
       int i = 1;
       int j = N-1;
        return findMinCost(arr,i,j);
    }

    private static int findMinCost(int[] arr,int i , int j) {

         if(i >= j)
            return 0;
         if(t[i][j] != -1)
             return t[i][j];
        t[i][j] = Integer.MAX_VALUE;
        for(int k = i ; k < j; k++){
           t[i][j] = Math.min(t[i][j],findMinCost(arr,i,k)+findMinCost(arr,k+1,j)+arr[i-1]*arr[j]*arr[k]);
        }

        return t[i][j];
    }
}
