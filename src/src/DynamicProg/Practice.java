package src.DynamicProg;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        //subset sum problem
     /*   int arr[] = {2,3,7,8,10};
        int sum = 12;

        System.out.println(subsetSumPresent(arr,sum));
*/

        //equal sum partition
       /* int arr[] = {1,5,12,5};
        System.out.println(equalSumPartition(arr));*/
        
        //count subset
      /*  int arr[] ={2,3,5,6,8,10};
        int sum = 10;
        System.out.println(countSubset(arr,sum));*/
        
        //Min difference sum
      /*  int[] arr = {1,2,7};
        int sum =0;
        for(int i = 0 ; i < arr.length ;i++)
         sum += arr[i];
        System.out.println(minDiffSum(arr,sum));*/

        //count the no of subset with given diff
        //Target sum = assign signs(+ or -) before every number so that the given diff is achieved
       /* int[] arr = {1,1,2,3};
        int diff = 1;
        System.out.println(NuOfSubsetWithGivebDiff(arr,diff));*/

        //fibonacci series
        int n = 9;
      //  System.out.println("test result :"+fibonnacciseries(n));

        //lcs
       /* String s1 = "AGGTAB";
        String s2 = "GXTXAYB";*/
        String s1 = "Sneehaaaa";
        String s2 = "Snehaaaa";

        int l1 = s1.length();
        int l2 = s2.length();
        //lcs(s1,s2,l1,l2);
      //  System.out.println("lcs new :"+  lcs1(s1,s2,l1,l2));

       // fibonacci series
        n = 10;
        System.out.println(fibon(n));

//min no of coins
        int coin[] = {25, 10,5};
        int sum = 30;
      //  System.out.println("min coin:"+minNoofCoins(coin,sum));

       /* String s = "nitik";
        int i = 0;
        int j = s.length()-1;
        System.out.println("pallindrome +"+pallindromepartition(s,i,j));*/


        for(int i = 2 ;  i <= 100 ; i++) {
            if (printPrime(i, 2) == 0) ;
            System.out.println(i);
        }
    }

    private static int printPrime(int i,int x) {
        if(i == x)
            return 0;
        if(i%x == 0)
            return 1;
        else
            return printPrime(i,i+1);
    }

    private static int pallindromepartition(String s, int i , int j) {
        if ( i > j)
            return 0;
        if( i == j)
            return 1;

        if(isPallindrome(s))
            return 1;
        int t[][] = new int[s.length()+1][s.length()+1];
        for(int[] row : t)
            Arrays.fill(row,-1);
        int minv = Integer.MAX_VALUE;
        for(int k = i ; k <j ; k++) {
            int temp = pallindromepartition(s, i, k) + pallindromepartition(s, k + 1, j)+1;
            if(minv > temp)
                minv = temp;
        }
        return minv;
    }

    private static boolean isPallindrome(String s) {
        int i = 0 ;
        int j = s.length() -1;

        while(i <=j){
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }else{
                return false;
            }
        }return true;
    }

    private static int fibon(int n) {
       if(n <= 1)
           return n;
// 0 1 2 3 5 8 13 21 34 55

        int t[] = new int[n+2];
        t[0] = 0;
        t[1] = 1;
        for(int i = 2 ; i <= n ; i++)
        t[i] = t[i-1]+t[i-2];
        return t[n];

    }

    private static Object lcs1(String s1, String s2, int l1, int l2) {
        if(l1 == 0 || l2 == 0)
            return 0;
        int t[][] = new int[l1+1][l2+1];

        for(int i = 0 ; i < l1+1 ; i++)
            t[i][0] = 0;
        for(int i = 0 ; i < l2+1 ; i++)
            t[0][i] = 0;
        int max_ln = Integer.MIN_VALUE;
        int end = 0;
        for(int i = 1 ; i < l1+1 ; i++) {
            for (int j = 1; j < l2 + 1; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                    if(t[i][j] > max_ln) {
                        max_ln = t[i][j];
                        end = i - 1;
                    }

                }
                else
                  //  t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                t[i][j] =0;
            }
        }

      /*  int m = l1;
        int n = l2;
        String s = "";
        while(m > 0 && n > 0){
            if(s1.charAt(m-1)==s2.charAt(n-1)){
                s = s1.charAt(m-1)+s;
            m--;
            n--;}
            else
                if(t[m-1][n] > t[m][n-1])
                    m--;
                else
                    n--;

        }*/
        return s1.substring(end-max_ln,max_ln);
    }

    private static int minNoofCoins(int[] coin, int sum) {
        int size = coin.length;
        if(size == 0 || sum == 0)
            return 0;
        int t[][] = new int[size+1][sum+1];
        for(int i =0 ; i< sum+1 ; i++)
            t[0][i] = Integer.MAX_VALUE-1;
        for(int i = 0 ;i < size+1 ; i++)
           t[i][0] = 0;
        for(int i = 1 ; i < sum+1 ; i++){
            if(i%coin[0] ==0)
                t[1][i] = i/coin[0];
            else
                t[1][i] = Integer.MAX_VALUE-1;
        } for(int i = 2; i < size+1; i++){
            for(int j = 1 ; j < sum+1 ; j++){
                if(coin[i-1] <=j)
                    t[i][j] = Math.min(1+t[i][j-coin[i-1]],t[i-1][j]);
                else
                    t[i][j] = t[i-1][j];
            }
        }
        return t[size][sum];
    }

   /* private static int lcs(String s1, String s2, int l1, int l2) {
        int s = 0;
        if(l1 == 0 || l2 == 0)
            return 0;
        int t[][] = new int[l1+1][l2+1];

        for(int[] row : t)
            Arrays.fill(row,-1);


                if(s1.charAt(l1-1)==s2.charAt(l2-1))
                    t[][] = s+s1.charAt(l1-1);
                else
                    s=s+ Math.max(lcs(s1,s2,l1-1,l2),lcs(s1,s2,l1,l2-1));

        return s;
    }
        }
        return s1;
    }   */

 /*   private static int fibonnacciseries(int n) {
        int t[][] = new int[n+1][n+1];

        *//*for(int[] row:t)
            Arrays.fill(row,-1);*//*

         fibonnacciseries[0] = 0;
        int fibonnacciseries[1] = 1;
        int t[][] = new int[n+1][n+1];

        *//*for(int[] row : t)
            Arrays.fill(t,-1);*//*
        int s = 0;
        if(n == 0)
            return a;
        if(n==1)
            return b;
        for(int i =2 ; i <n ;i++) {
            for (int j = 2; j < n; j++)

                t[i][j] =
            fibonnacciseries(n - 1) + fibonnacciseries(n - 2);
        }

        return t[n][n];
    }*/

    private static int NuOfSubsetWithGivebDiff(int[] arr, int diff) {
        int sum = 0;
        int size = arr.length;
        for(int i = 0 ; i < arr.length ; i++)
            sum += arr[i];

        // let subset1 = s1 and subset2 = s2
        //s1+s2=sum
        //s1-s2=diff
        //s1 = (sum+diff)/2

        int subset1 = (sum+diff)/2;
        int t[][] = new int[size+1][subset1+1];

        for(int i = 0 ; i < subset1+1;i++)
            t[0][i] = 0;
        for(int i = 0 ; i < size+1 ; i++)
            t[i][0] = 1;

        for(int i = 1 ; i < size+1 ; i++){
            for(int j = 1 ; j < subset1+1 ; j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i-1][j-arr[i-1]]+t[i-1][j];
                else if(arr[i-1]>j)
                    t[i][j] = t[i-1][j];
            }
        }return t[size][subset1];
    }

    private static int minDiffSum(int[] arr, int sum) {
        int size = arr.length;
        boolean t[][] = new boolean[size+1][sum+1];
        for(int i = 0 ; i < sum+1 ; i++)
            t[0][i] = false;
        for(int i = 0 ; i < size+1 ; i++)
            t[i][0] = true;

        for(int i = 1 ; i < size+1;i++){
            for(int j = 1 ; j < sum+1 ;j++){
                if(arr[i-1]<=j)
                t[i][j] = t[i-1][j-arr[i-1]]||t[i-1][j];
                else if(arr[i-1]>j)
                    t[i][j] = t[i-1][j];

            }
        }
        int j = 0;
        for(j =sum/2; j >=0 ; j--){
            if(t[size][j] == true)
                break;
        }int ans = sum - (2*j);
        return ans;
    }

    private static int countSubset(int[] arr, int sum) {
        if(arr.length == 0 || sum ==0)
            return 0;
        int t[][] = new int[arr.length+1][sum+1];
        for(int i = 0 ; i < sum+1 ; i++)
            t[0][i] = 0;
        for(int i = 0 ; i < arr.length+1 ;i++)
            t[i][0]=1;

        for(int i = 1 ; i < arr.length+1;i++){
            for(int j = 1 ; j < sum+1;j++){
                if(arr[i-1]<=j)
                t[i][j] = t[i-1][j-arr[i-1]]+t[i-1][j];
                else if(arr[i-1]>j)
                    t[i][j]=t[i-1][j];
            }
        }return t[arr.length][sum];
    }

    private static boolean equalSumPartition(int[] arr) {
        int sum = 0;
        for(int i = 0 ; i < arr.length ; i++)
            sum += arr[i];
        int reqdSum = sum/2;
        if(sum%2 != 0)
            return false;
        int size =arr.length;
        boolean t[][] = new boolean[size+1][reqdSum+1];
        for(int i = 0 ; i < reqdSum+1 ; i++)
            t[0][i] = false;
        for(int j = 0 ; j < size+1 ; j++)
            t[j][0] = true;
        for(int i = 1 ; i < size+1; i++){
            for(int j = 1 ; j < reqdSum+1 ; j++){
                if(arr[i-1] <= j)
                    t[i][j] = t[i-1][j-arr[i-1]]||t[i-1][j];
                else if(arr[i-1] > j)
                    t[i][j] = t[i-1][j];
            }
        }return t[size][reqdSum];

    }


    private static boolean subsetSumPresent(int[] arr, int sum) {
        int size = arr.length;;
        if(size == 0 || sum == 0)
            return false;
        boolean t[][] = new boolean[size+1][sum+1];

        for(int i = 0 ; i < sum+1 ; i++)
            t[0][i] = false;
        for(int i = 0 ; i < size+1 ; i++)
            t[i][0] = true ;


        for(int i = 1; i < size+1 ; i++){
            for(int j = 1 ; j < sum+1 ; j++){

                if(arr[i-1] <= j)
                    t[i][j] = t[i-1][j-arr[i-1]] || t[i-1][j];
                else if(arr[i-1] > j)
                    t[i][j] = t[i-1][j];

            }
        } return t[size][sum];
    }
}
