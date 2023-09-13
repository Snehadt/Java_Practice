package src;

import java.util.Arrays;

public class AnagramsString {
    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "edabcr";

       char[] c1 = s1.toCharArray();
       char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(c1.length!=c2.length) {
            System.out.println("Stringa re not anagrams");

        }else{
        for(int i = 0 ; i < c1.length ; i++){
            if(c1[i]==c2[i])
                System.out.println("Anagram");
            else
                System.out.println("Not anagram");
        }}
    }
}
