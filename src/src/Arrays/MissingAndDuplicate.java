package src.Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MissingAndDuplicate {
    public static void main(String[] args) {
        int[] a = {3,4,2,1,5,5,7};
        missingAndDuplicate(a);
    }

    private static void missingAndDuplicate(int[] a) {
        int sum = 0;

        int num =a.length;
        int sum1 = num*(num+1)/2;

        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i<a.length ; i++){
            if(!set.contains(a[i]))
                set.add(a[i]);
            else
                System.out.println("Duplicate number :"+a[i]);
        }
   for(Integer i : set){
       sum = sum+i;
   }
        System.out.println(sum);
        System.out.println(sum1);
        System.out.println("Missing Number :"+(sum1-sum));

    }
}
