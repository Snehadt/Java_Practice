package src.Arrays;

public class Segregate0ANd1 {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0};
        int n = 5;
        segregateNum(arr,n);
    }

    private static void segregateNum(int[] arr, int n) {
        int count = 0;

        for(int i = 0; i<arr.length ; i++){
            if(arr[i]==0) count++;
        }

        for(int i = 0 ; i< count ;i++)
        {
            arr[i]=0;
        }
        for(int i = count ; i<arr.length ;i++){
            arr[i]=1;
        }

        for(int i = 0 ; i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
