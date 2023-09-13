package src.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,56,34};
       // revArray(arr);
        revArr(arr);
    }
//method 1
    private static void revArray(int[] arr) {
        int[] revArr = new int[arr.length];
        for(int i = arr.length-1 ; i>=0;i--)
            revArr[(arr.length-1)-i]=arr[i];
        for(int i = 0 ; i<revArr.length ;i++)
            System.out.println(revArr[i]+ "");
    }

//method 2
    private static  void revArr(int[] arr){
        int low = 0;
        int high = arr.length-1;
        int temp = 0;
        while(low<high){
            temp = arr[high];
            arr[high] = arr[low];
            arr[low]= temp;
            low++;
            high--;
        }
        for(int i = 0 ; i < arr.length ; i++)
            System.out.println(arr[i]+ " ");
    }
}
