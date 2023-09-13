package src.Arrays;

import java.util.Arrays;

public class LargestElementArray {
    public static void main(String[] args) {
        int A[] = {1, 8, 7, 56, 90};
        int n =A.length;
        largestElementInArray(A);
        largestElementInArray2(A,n);

    }
//method 2
    private static void largestElementInArray2(int[] a, int n) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i<n ;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println("Largest Element 2 :"+max);
    }

    //method 1
    private static void largestElementInArray(int[] a) {
        Arrays.sort(a);
        System.out.println("Largest Element :"+a[a.length-1]);
    }

//method 2

}
