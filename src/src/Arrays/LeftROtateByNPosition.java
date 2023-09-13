package src.Arrays;

public class LeftROtateByNPosition {
    public static void main(String[] args) {
        int[] arr = {2,6,1,4,5,3,9};
        int n = 2 ;
        leftrotateByNPlaces(arr,n);
    }

    private static void leftrotateByNPlaces(int[] arr,int n) {
      // int temp = arr[0];
       int[] a1 = new int[n];
       for(int i = 0 ; i < n ; i++){
           a1[i]=arr[i];
       }
        for(int i = n ; i < arr.length ; i++){
            arr[i-n] = arr[i];}

        for(int i = 0; i <n ; i++){
            arr[arr.length-n+i] = a1[i];
        }

        for(int i = 0 ; i<arr.length ; i++)
            System.out.println(arr[i]);
    }
}
