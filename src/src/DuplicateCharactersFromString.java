package src;

import java.util.*;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class DuplicateCharactersFromString {
    public static void main(String[] args) {
        String s = "Sneheas";
      //  s.chars().mapToObj(x -> (char)x).collect(groupingBy(x -> x , counting())).entrySet().stream();
        Map<Character,Integer> map = new HashMap<>();
       char[] ch =  s.toCharArray();
       for(Character c : ch){
           Integer count = map.get(c);
           if(count == null)
               map.put(c,1);
           else
               map.put(c,++count);
       }
       Set<Map.Entry<Character,Integer>> entry =map.entrySet();
       for(Map.Entry<Character,Integer> en : entry){
           //if(en.getValue()>1)
               System.out.println(en.getKey()+""+en.getValue());
       }
    }
}
