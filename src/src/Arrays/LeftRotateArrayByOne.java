package src.Arrays;

public class LeftRotateArrayByOne {
    public static void main(String[] args) {
        int[] arr = {2,8,4,1,9};
        int rotate = 1;
        leftRotateByOne(arr,rotate);
    }

    private static void leftRotateByOne(int[] arr,int rotate) {
        int size = arr.length;
        int count = 0 ;
        int temp = 0;
        while(count<rotate){
            temp =arr[0];
            arr[0]= arr[size-count-1];
            arr[size-1] = temp ;
            count++;
        }

        for(int i = 0 ; i<size;i++)
            System.out.println(arr[i]);
    }
}
