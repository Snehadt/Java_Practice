package src;

import java.util.*;

public class RemoveVowelsFromString {

    public static void main(String[] args) {
        String s = "aeiou";
       // System.out.println(removeVowels(s));
        System.out.println(removeVowelsMethod2("Sneha"));
    }

    private static List<Character> removeVowels(String s) {
        char[] c = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for(Character ch : c){
            if(ch.equals('a')||ch.equals('e')||ch.equals('i')||ch.equals('o')||ch.equals('u')||
                    ch.equals('A')||ch.equals('E')||ch.equals('I')||ch.equals('O')||ch.equals('U'))
               System.out.println("Character is vowel excluding...");
            else{
                list.add(ch);
            }
        } return list;
    }

    public static String removeVowelsMethod2(String st){
        Set<Character> set = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');

        StringBuilder stt = new StringBuilder();
        for(char c : st.toCharArray()){
            if(!set.contains(c))
                stt.append(c);
        }return stt.toString();
    }
}
