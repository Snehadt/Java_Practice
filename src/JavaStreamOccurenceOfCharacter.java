import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaStreamOccurenceOfCharacter {

    public static void main(String[] args){
        String s = "aaaabbbcccddddddd";

        countOccurence(s);
    }

    static void countOccurence(String s){
        char[] c =s.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        int max = 0;
    char maxChar = 0;
        for(Character ch : c){
            Integer count =map.get(ch);
           if(map.get(ch)==null)
               map.put(ch,1);
           else
               map.put(ch,++count);
        }

        Set<Map.Entry<Character,Integer>> entry = map.entrySet();
        for(Map.Entry<Character,Integer> en : entry)
           if(en.getValue()>max){
               max=en.getValue();
               maxChar = en.getKey();
           }
System.out.println(maxChar+""+max);

    }

}
