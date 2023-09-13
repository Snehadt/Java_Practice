package src.Arrays;

import java.util.Vector;

public class PrintAllSubset {
    public static void main(String[] args) {
      /*  int arr[] = { 2, 5, 8, 4, 6, 11 };
        int sum = 13;
        int n = arr.length;
        printAllSubsets(arr, n, sum);*/

 /*       int arr[] = {1,2,7};
        System.out.println(minSubDiff(arr));*/

        int arr[] = {1,2,4,5,9,10};
        int x = 10;
        subsetAddition(arr,x);
    }

    private static void subsetAddition(int[] arr, int x) {
        int size = arr.length;
        boolean t[][] = new boolean[size+1][x+1];
        for(int i = 0 ; i < x+1 ; i++)
            t[0][i] = false;
        for(int j = 0 ; j < size+1 ; j++)
            t[j][0] = true;
        for(int i = 1 ; i < size+1 ; i++){
            for(int j = 1 ; j < x+1 ;j++){
                if(arr[i-1] <= j)
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                else
                    t[i][j] = t[i-1][j];
            }
        } for(int i = 0 ; i < size ; i++){
            for(int j = 0 ; j<x ; j++)
           if(t[i][j] == true)
               System.out.println(i+" "+j);
        }
    }

    private static int minSubDiff(int[] arr) {
        int range = 0 ;
        for(int i = 0 ; i < arr.length ; i++)
            range = range + arr[i];

       return subSetSumProblem(arr,range);
    }

    private static int subSetSumProblem(int[] arr, int range) {
        int size = arr.length;
        boolean t[][] = new boolean[size+1][range+1] ;
        for(int i = 0 ; i < range+1 ; i++)
            t[0][i] = false ;
        for(int i = 0 ; i < size+1 ; i++)
            t[i][0] = true;
        for(int i = 1 ; i < size+1 ; i++){
            for(int j = 1 ; j < range +1 ; j++){
                if(arr[i-1]<= j){
                  t[i][j] =  t[i-1][j-arr[i-1]] || t[i-1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        int diff = Integer.MAX_VALUE;
        for(int i = range/2 ; i >= 0 ; i--){
            if(t[size][i] == true){
                diff = range - 2*i;
                break;
            }
        } return diff;
    }

    private static void printAllSubsets(int[] arr, int n, int sum) {
        Vector<Integer> v= new Vector<Integer>();
        printAllSubsetsRec(arr, n, v, sum);
    }

    private static void printAllSubsetsRec(int[] arr, int n, Vector<Integer> v, int sum) {
        if (sum == 0) {
            for (int i=0;i<v.size();i++)
                System.out.print( v.get(i) + " ");
            System.out.println();
            return;
        }

        // If no remaining elements,
        if (n == 0)
            return;

        // We consider two cases for every element.
        // a) We do not include last element.
        // b) We include last element in current subset.
        printAllSubsetsRec(arr, n - 1, v, sum);
        Vector<Integer> v1=new Vector<Integer>(v);
        v1.add(arr[n - 1]);
        printAllSubsetsRec(arr, n - 1, v1, sum - arr[n - 1]);
    }
}
