package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class MaxOccuringString {
    public static void main(String[] args) {
        String s = "abcdaba";
       // maxOccuringString(s);
        System.out.println(maxOccureningCharacterUsingStream(s));
    }

    private static Character maxOccureningCharacterUsingStream(String s) {
       return s.chars().mapToObj(c -> (char)c).collect(groupingBy(x -> x, counting())).entrySet().stream()
                .max(comparingByValue()).get().getKey();
    }

    private static void maxOccuringString(String s) {
       char[] ch = s.toCharArray();
       Map<Character,Integer> map = new HashMap<>();
       for(Character c : ch){
           Integer count = map.get(c);
           if(count==null)
               map.put(c,1);
           else
               map.put(c,++count);
       }
        int maxVal = Integer.MIN_VALUE ;
        char maxOccurence = 0;
        Set<Map.Entry<Character,Integer>> set = map.entrySet();
       for(Map.Entry<Character,Integer> en : set) {
           if (en.getValue() > maxVal) {
               maxVal = en.getValue();
               maxOccurence = en.getKey();
           }
       }System.out.println(maxOccurence);
    }

}
