package src.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {10,20,20,30,40,40};
       int size =  arr.length;
        removeDup(arr,size);
    }

    private static void removeDup(int[] arr, int size) {
       Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        Iterator<Integer> it =set.iterator();
        while(it.hasNext())
            System.out.println(it.next());

    }
//methods
 /*   private static void removeDup(int[] arr, int size) {
        int start = 0;
        int end = size -1;
        int mid = start+(end-start)/2;

        if(mid == 0)
            return 0;
        else if (arr[mid]==arr[mid-1])
            
    }*/
}
