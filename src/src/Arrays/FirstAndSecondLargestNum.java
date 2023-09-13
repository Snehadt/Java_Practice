package src.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstAndSecondLargestNum {
    public static void main(String[] args) {
        int[] a = {90,89,97,76,55};
      // int[] ans = numSrray(a);
       // System.out.println(Arrays.toString(ans));
        System.out.println(numSrray(a));
    }

    private static String numSrray(int[] a) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int[] n = new int[2];
        for(int i = 0 ; i< a.length ; i++){
            if(a[i]>first){
                second = first;
                first = a[i];

            } else if(a[i]>second && a[i] != first){
                second = a[i];
            }
        }
        n[0]=first;
        n[1]=second;
        //return n;
        return first+" "+second;
    }
}
