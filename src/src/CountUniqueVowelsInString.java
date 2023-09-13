package src;

import java.util.HashSet;
import java.util.Set;

public class CountUniqueVowelsInString {
    public static void main(String[] args) {
        String s = "siiaeuertysyd";
        System.out.println(countUniqueVowels(s));
        System.out.println(distinctVowelCount(s));
    }

    private static int countUniqueVowels(String s) {
        Set<Character> set = new HashSet<>();
        int count = 0;
        Set<Character> set1 = new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        char[] ch =s.toCharArray();
        for(Character c : ch){
            if(set.contains(c)){
                set1.add(c);
            }

        }
        for(Character c1 : set1)
        {
            System.out.println("unique vowels"+c1);
        }
        count =set1.size();
            return count;
    }
//method 2
    public static long distinctVowelCount(String s){
       long count = s.chars().mapToObj(c->(char)c).filter(c->"aeiou".indexOf(c)>-1).distinct().count();
       return count;
    }
}