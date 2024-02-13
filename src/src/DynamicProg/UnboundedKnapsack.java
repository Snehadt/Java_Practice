package src.DynamicProg;


public class UnboundedKnapsack {
    public static void main(String[] args) {
        // Rod cutting problem
       /* int length[] = {1,2,3,4,5,6,7,8,9};
        int price[] = {1,5,8,9,10,17,17,20};
        int rod_ln = 8;

        System.out.println(rodcuttingToincreaseProfit(length,price,rod_ln));*/

        // coin change problem - max number of ways
       /* int arr[] = {1,2,3};
        int sum = 5;
        System.out.println(maxNoOfWays(arr,sum));*/

        //coin change problem - min no of coins
        int[] coin = {1,2,3};
        int sum = 5;
        System.out.println(minCoin(coin,sum));
    }

    private static int minCoin(int[] coin, int sum) {
        int size = coin.length;
        int t[][] = new int[size+1][sum+1];

        for(int i = 0 ; i < sum+1 ; i++)
            t[0][i] = Integer.MAX_VALUE -1;
        for(int j = 0 ; j < size+1 ; j++)
            t[j][0] = 0;

        for(int i = 1 ; i < sum+1 ; i++){

                if(i%coin[0]==0)
                    t[1][i] = i/coin[0];
                else
                    t[1][i] = Integer.MAX_VALUE-1;

        }
        for(int i = 1 ; i < size+1 ; i++){
            for(int j = 1 ; j < sum+1 ; j++){
                if(coin[i-1] <=j)
                    t[i][j] = Math.min(t[i][j-coin[i-1]]+1,t[i-1][j]);
                else if(coin[i-1]>j)
                    t[i][j]=t[i-1][j];
            }

        }return t[size][sum];
    }

    private static int maxNoOfWays(int[] arr, int sum) {
        if(arr.length == 0 || sum == 0)
            return 0;
        int size = arr.length;
        int t[][] = new int[size+1][sum+1];

        for(int i = 0 ; i< sum+1;i++)
            t[0][i]=0;
        for(int j = 0 ; j < size+1;j++)
            t[j][0]=1;
        for(int i = 1 ; i < size+1;i++){
            for(int j = 1 ; j < sum+1;j++){
                if(arr[i-1]<=j)
                    t[i][j] = t[i][j-arr[i-1]]+t[i-1][j];
                else if(arr[i-1]>j)
                    t[i][j]=t[i-1][j];
            }
        }
        return t[size][sum];
    }

    private static int rodcuttingToincreaseProfit(int[] lengtha, int[] price, int rod_ln) {
        int size = lengtha.length;
        int t[][] = new int[size+1][rod_ln+1];

        if(size == 0 || rod_ln ==0)
            return 0;
        for(int i = 0 ; i < rod_ln+1; i++)
            t[0][i] =0;
        for(int i = 0 ; i < size+1; i++)
            t[i][0] =0;
        for(int i = 1 ; i  < size+1 ; i++){
            for(int j = 1 ; j < rod_ln+1 ;j++){
                if(lengtha[i-1]<=j)
                t[i][j]= Math.max(price[i-1]+t[i][j- lengtha[i-1]],t[i-1][j]);
                else if(lengtha[i-1] >j)
                    t[i][j] =t[i-1][j];
            }
        }return t[size][rod_ln];

    }
}

