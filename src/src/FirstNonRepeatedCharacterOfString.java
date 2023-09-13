package src;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FirstNonRepeatedCharacterOfString {
    public static void main(String[] args) {
        String s = "morning";
       // firstNonRepeatedCharaacter(s);
        firstNonrepeatingCharacterWithoutUsingSet(s);

    }

    private static void firstNonrepeatingCharacterWithoutUsingSet(String st) {
       char[] ch = st.toCharArray();
       for(int i = 0 ; i < st.length();i++){
           if(st.indexOf(i)==st.lastIndexOf(i))
               System.out.println("The first non repeating character is :"+st.charAt(i));
           return;
       }
    }

    static void firstNonRepeatedCharaacter(String st){
        char[] ch =st.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(Character c : ch){
            Integer count = map.get(c);
            if(count == null)
                map.put(c,1);
            else
                map.put(c,++count);
        }
        Set<Map.Entry<Character,Integer>> en =map.entrySet();
        for(Map.Entry<Character,Integer> e : en){
            if(e.getValue()==1){
                System.out.println(e.getKey());
                return;
            }
        }
    }
}
