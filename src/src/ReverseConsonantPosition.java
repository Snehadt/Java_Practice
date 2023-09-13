package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseConsonantPosition {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseConsonant(s));
    }

    private static String reverseConsonant(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int left = 0;
        int right = s.length()-1 ;
        char[] ch =s.toCharArray();
        while(left<right){
            if(set.contains(ch[left]))
                left++;
            else if (set.contains(ch[right]))
                right --;
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp ;
                left++;
                right --;
            }

        }  return new String(ch);
    }
}
