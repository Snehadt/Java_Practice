package src.Arrays;

import java.util.ArrayList;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
     //   int[] arr = {0,1,1,0,1,1,0,1};
        int[] arr = {8,0,10,8,3,0,4,2,0};
     //   moveZeroes(arr);
        moveZeroes1(arr);
    }

    private static void moveZeroes1(int[] arr) {
        int size = arr.length;
        int arr1[] = new int[size];
        ArrayList<Integer> a1 = new ArrayList<>();
        int count = 0 ;
        for(int i = 0 ; i < size ; i++){
            if(arr[i]!=0)
             a1.add(arr[i]) ;
            else if(arr[i]==0)
                count++;
        }
        for(int i = a1.size(); i<arr.length;i++){
            if(count>0){
                a1.add(0);
                count--;
            }

        }

       // for(int i = 0 ; i< a1.size() ; i++)
            System.out.println(a1);
    }

    private static void moveZeroes(int[] arr) {
        int size = arr.length;
        int arr1[] = new int[size];
        int count = 0;
        for(int i = 0 ; i<size; i++){
            if(arr[i]==1)
                count ++;
        }
        for(int i = 0 ; i< count ; i++){
            arr1[i] = 1;
        }
        for(int i = count ; i< arr1.length ; i++){
            arr1[i] = 0;
        }

        for(int i = 0 ; i<arr1.length ; i++)
            System.out.println(arr1[i]);
    }
}
