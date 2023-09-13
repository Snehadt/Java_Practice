package src.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaxOccuringIneteger {
    public static void main(String[] args) {
        int A[] = {1,2,3,3};
        int n = 3;
        System.out.println(majorityElement(A,n));
    }

    private static int majorityElement(int[] a, int size) {
        int maxNum = size/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : a){
            Integer count = map.get(i);
            if(count == null)
                map.put(i,1);
            else
                map.put(i,++count);
        }

        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        for(Map.Entry<Integer,Integer> en : set){
            if(en.getValue()>maxNum)
                return en.getKey();
        } return -1;
    }
}
