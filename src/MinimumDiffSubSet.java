public class MinimumDiffSubSet {

    public static void main(String[] args){
        int arr[] = {1,2,7};
        int size = arr.length;
        int range = 0;
        for(int i = 0 ; i< size ; i++){
            range=range+arr[i];
        }

        System.out.println(minimalSum(arr,size,range));
    }

    private static boolean SubSetDiff(int[] arr, int size, int range) {

        boolean t[][] = new boolean[size+1][range+1];
        for(int i = 0 ;i < range+1 ; i++)
            t[0][i]= false;
        for(int i = 0 ; i < size+1 ; i++)
            t[i][0]=true;
        for(int i = 1 ; i < size+1 ; i++){
            for(int j = 1 ; j < range+1 ; j++){
                if(arr[i-1]<=j)
                    t[i][j]=t[i-1][j]||t[i-1][j-arr[i-1]];
                if(arr[i-1]>j)
                    t[i][j]=t[i-1][j];
            }
        }
        return t[size][range];
    }

    public static int minimalSum(int arr[] , int size , int range){
        int k = 0 ;
        int diff = Integer.MAX_VALUE;
        boolean t= SubSetDiff(arr,size,range);

        int mid = range/2;

            for(int i = 0 ; i < mid ; i++){
                int currentDiff = range-(2*i);
               diff =  Math.min(diff,currentDiff);

            }
        return diff;
    }
}
