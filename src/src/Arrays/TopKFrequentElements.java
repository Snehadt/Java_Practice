package src.Arrays;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int k =2 ;
        System.out.println(topKFrequent(nums,k));
    }

    private static int[] topKFrequent(int[] nums, int k) {
        int[] n = new int[k];
       int max = Integer.MIN_VALUE;
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : nums){
            Integer count = map.get(i);
            if(count == null)
                map.put(i,1);
            else
                map.put(i,++count);
        }

     List<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,Comparator.comparing(Map.Entry<Integer,Integer>::getValue).thenComparing(
                Map.Entry::getKey).reversed()
        );
        for(int i = 0 ; i<n.length;i++){
            n[i] = list.get(i).getKey();
            System.out.println(n[i]);
        } return n;

    }
}
