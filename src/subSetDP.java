public class subSetDP {

    public static void main(String[] args){
        int[] arr = {1,2,3,5,8,10};
        int size = arr.length;
        int sum = 11;
      //  System.out.println(subSetSum(arr,size,sum));
        subSetSum(arr,size,sum);
    }

    private static void subSetSum(int[] arr, int size, int sum) {
        int[][] t=  new int[size+1][sum+1];
        for(int i = 0 ; i < sum ; i++)
            t[0][i] = 0;
        for(int i = 0 ; i<size ; i++)
            t[i][0] = 1;
        for(int i = 1 ; i < size+1 ; i++)
        {
            for(int j = 1 ; j<sum+1 ; j++){
                if(arr[i-1]<= j){
                    t[i][j] = t[i-1][j]+t[i-1][j-arr[i-1]];
                } else if(arr[i-1]>j){
                    t[i][j]= t[i-1][j];
                }
            }

        } //return t[size][sum];
        System.out.println(t[size][sum]);
    }
}
