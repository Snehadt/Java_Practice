package src;

import java.util.*;

public class CharacterAndNumberShuffle {
   

    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3} ;

        characterNumberShuffle(s,indices);
    }

    private static void characterNumberShuffle(String s, int[] indices) {
        Map<Character,Integer> map = new HashMap<>();

       for(int i = 0 ; i < indices.length ; i++){
           map.put(s.charAt(i),indices[i]);
       }

       Set<Map.Entry<Character,Integer>> set =map.entrySet();
      List<Map.Entry<Character,Integer>> list = new ArrayList<Map.Entry<Character,Integer>>(set);
      Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
          @Override
          public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
              return o1.getValue().compareTo(o2.getValue());
          }

      });
      for (Map.Entry<Character,Integer> en : list)
          System.out.println(en.getKey());
    }

    //alternate
public static String CharacterNumberShuffle(String s, int[] indices){
    char[] c = new char[indices.length];
    for(int i = 0 ; i < indices.length;i++){
        c[indices[i]]=s.charAt(i);
    }return new String(c);
}


}
