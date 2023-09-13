package src;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseVowelPosition {
    public static void main(String[] args)  {
        String s = "helloh";
        System.out.println(reverseVowelPosition(s));
    }

    private static String reverseVowelPosition(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int left = 0 ;
        int right = s.length()-1;
        char[] ch =s.toCharArray();
        while(left<right){
            if(!set.contains(ch[left]))
                left++;
            else if(!set.contains(ch[right]))
                right--;
            else{
                char temp = ch[left];
                ch[left]= ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        return new String(ch);

    }
}