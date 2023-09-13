package src;

import java.util.HashSet;
import java.util.Set;

public class NumberOfStringInSubstring {
    public static void main(String[] args) {
     //   String[] pattern = {"a","abc","bc","d"};
       // String word = "abc";
        String[] pattern = {"a","b","c"};
        String word = "aaaaabbbbb";
        System.out.println(getSubstringCount(pattern , word));
    }

    private static int getSubstringCount(String[] pattern, String word) {
        int count = 0;
        for(String st : pattern){
            if(word.contains(st)){
                System.out.println(st);
                count++;
            }

        } return count;
    }
}
