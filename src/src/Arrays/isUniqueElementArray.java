package src.Arrays;

import java.util.HashSet;
import java.util.Set;

public class isUniqueElementArray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,4};
        System.out.println(isUnique(a));
    }

    private static boolean isUnique(int[] a) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i< a.length ; i++){
            if(!set.contains(a[i])){
                set.add(a[i]);
            }
            else{
                return false;
            }
        } return true;
    }
}
