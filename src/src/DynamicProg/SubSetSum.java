package src.DynamicProg;

public class SubSetSum {
    public static void main(String[] args) {
        int arr[] = {2,3,5,7,8,10};
        int sum = arr.length;
        int size = 10;
        System.out.println(isSubsetPresent(arr,sum,size));
    }

    private static boolean isSubsetPresent(int[] arr, int sum, int size) {
        boolean t[][] = new boolean[sum+1][size+1];
        for(int i = 0 ; i < size ; i++)
            t[0][i]=false;
        for(int i = 0 ; i < sum ; i++)
            t[i][0]=true;
        for(int i = 1 ; i < sum+1;i++){
            for(int j = 1 ; i < size+1 ; j++){
                if(arr[i-1]<=j){
                    t[i][j] = t[i-1][j]||t[i-1][j-arr[i-1]];
                   // t[i][j] = t[i-1][j]||t[i-1][j-arr[i-1]];
                }else if(arr[i-1]>j){
                    t[i][j]= t[i-1][j];
                }
            }
        }return t[sum][size];

    }
}
