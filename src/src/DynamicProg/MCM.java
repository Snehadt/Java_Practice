package src.DynamicProg;

import java.util.Arrays;

public class MCM {

    static int t[][] = new int[1001][1001];
    public static void main(String[] args) {
        int[] arr = {40,20,30,10,30};
        int size = arr.length;
        int sz = size -1;
       // Recursion

      //  System.out.println(mcmRecusrsion(arr,1,sz));
        // Top down
/*
        for(int i[] : t)
            Arrays.fill(i,-1);

        System.out.println(mcmTopDown(arr,1,sz));*/

       /* String s = "nitik";
        for(int row[] : t)
            Arrays.fill(row,-1);
        char[] ch = s.toCharArray();
        int sz1 = s.length()-1;
        System.out.println(pallindromePartition(s,0,sz1));*/
        
        //egg dropping problem - find the minimum no of worst case scenario where the egg will not break
        int eggs = 3;
        int floor = 5;
        // recursive code
       // System.out.println(eggDropRecursive(eggs,floor));
        
        // Memozised code;

      //  System.out.println(eggDropMemozised(eggs,floor));

        // Memozised code optimization
        System.out.println(eggDropOptimizedMemozised(eggs,floor));



    }

    private static int eggDropOptimizedMemozised(int e, int f) {

        int t[][] = new int[e+1][f+1];

        for(int[] row : t)
            Arrays.fill(row,-1);
        if(e==1 || f==0 || f==1)
            return f;
        if(t[e][f] != -1)
            return t[e][f];
        int mn = Integer.MAX_VALUE;
        int low = 0;
        int high = 0;
        for(int k = 1 ; k <=f ; k++) {
            if(t[e-1][k-1] != -1 )
                low = t[e-1][k-1];
            else {
                low = eggDropOptimizedMemozised(e - 1, k - 1);
                t[e-1][k-1] = low;
            }

            if(t[e][f-k] != -1 )
                high = t[e][f-k];
            else {
                high = eggDropOptimizedMemozised(e, f-k);
                t[e][f-k] = high;
            }
            int temp = 1+ Math.max(low,high);
            mn = Math.min(mn,temp);

        }return mn;
    }

    private static int eggDropMemozised(int e, int f) {
        int t[][] = new int[e+1][f+1];

        for(int r[] : t)
        Arrays.fill(r,-1);

        //base condition
        if(e==1 || f==0 || f==1)
            return f;

        if(t[e][f] != -1)
            return t[e][f];

        int mn = Integer.MAX_VALUE;
        for(int k = 1 ; k <=f ; k++){
            int temp = 1 + Math.max(eggDropRecursive(e - 1,k-1),eggDropRecursive(e,f-k));

            mn = Math.min(mn,temp);
            t[e][f]=mn;
        }
        return mn;
    }

    private static int eggDropRecursive(int e, int f) {

        //base condition
        if(f==0 ||f==1 || e== 1)
            return f;

        int mn = Integer.MAX_VALUE;
        for(int k = 1; k <=f ; k++) {
           int temp = 1 + Math.max(eggDropRecursive(e - 1,k-1),eggDropRecursive(e,f-k));
           mn = Math.min(temp,mn);
        }
        return mn;
    }

    static boolean isPallindrome(String  s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;

        } return true;
    }

    private static int pallindromePartition(String s, int i, int j) {
        int tempAns = 0;
        int ans = Integer.MAX_VALUE;
        if(i >= j)
            return 0;

        if(t[i][j] != -1)
            return t[i][j];

        if(isPallindrome(s))
            return 0;
        for(int k = i ; k < j ; k++){
            tempAns =1+pallindromePartition(s,i,k)+pallindromePartition(s,k+1,j);
            if(tempAns < ans)
                ans = tempAns;

        } t[i][j] = ans;
        return t[i][j];
    }

    /*private static int mcmTopDown(int[] arr, int i, int j) {
        int tempAns = 0;
        int mn = Integer.MAX_VALUE;
        if (i >= j)
            return 0;
        if (t[i][j] != -1)
            return t[i][j];
        for (int k = i; k < j; k++) {
            tempAns =  mcmTopDown(arr, i, k) + (arr[i - 1] * arr[k] * arr[j]) + mcmTopDown(arr, k + 1, j);
            if(tempAns < mn)
                mn = tempAns;
        }
        t[i][j] = mn;
        return t[i][j];
    }*/

   /* private static int mcmRecusrsion(int[] arr, int i, int j) {
        int tempAns = 0;
        int ans = Integer.MAX_VALUE;
        if(i >=j)
            return 0;
        for(int k = i ; k < j ; k++){
            tempAns = (mcmRecusrsion(arr,i,k))+(arr[i-1]*arr[k]*arr[j])+(mcmRecusrsion(arr,k+1,j));
            if(tempAns < ans)
                ans = tempAns;
        }
        return ans;
    }*/





   /* private static int findMinCost(int[] arr,int i , int j) {

         if(i >= j)
            return 0;
         if(t[i][j] != -1)
             return t[i][j];
        t[i][j] = Integer.MAX_VALUE;
        for(int k = i ; k < j; k++){
           t[i][j] = Math.min(t[i][j],findMinCost(arr,i,k)+findMinCost(arr,k+1,j)+arr[i-1]*arr[j]*arr[k]);
        }

        return t[i][j];
    }*/
}
