package src;

import java.util.Set;
import java.util.TreeSet;

public class AddDistinctCharacter {
    public static void main(String[] args) {
        String s = "ddaaaabbbbcccc";
        System.out.println(distinctString(s));
    }

    private static String distinctString(String s) {
        Set<Character> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for(Character c : ch){
            if(!set.contains(c))
                set.add(c);
        }
        for(Character st : set){
            sb.append(st);
        }
        return sb.toString();
    }
}
