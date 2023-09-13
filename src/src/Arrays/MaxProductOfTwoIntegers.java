package src.Arrays;

import java.util.Arrays;

import static java.lang.Math.max;

public class MaxProductOfTwoIntegers {
    public static void main(String[] args) {
        int[] intArray = {10,20,30,40,50,10};
        int[] res = maxProduct(intArray);
        System.out.println(Arrays.toString(res));
    }

    private static int[] maxProduct(int[] intArray) {
        int maxNum = Integer.MIN_VALUE;
        int secondMaxNum = Integer.MIN_VALUE;
        int[] arr = new int[2];
        for(int i = 1 ; i < intArray.length ; i++){
            int prod = intArray[i-1]*intArray[i];
            if(prod>maxNum){
                secondMaxNum = maxNum;
                maxNum = prod;
                arr[0]=intArray[i-1];
                arr[1]=intArray[i];
            }
            else{
                continue;
            }

        }
        return arr;
    }
}
