package src;

public class LongestPallindromeString {
    public static void main(String[] args) {
        String s = "babad";
        longestPallindrome(s);
    }

    private static void longestPallindrome(String s) {
        int[] abc = new int[26];
       char[] ch = s.toCharArray();
      for(int i = 0 ; i< s.length() ; i++){
         abc[i] = (s.charAt(i));
      }
        System.out.println(abc.toString());
    }
}
