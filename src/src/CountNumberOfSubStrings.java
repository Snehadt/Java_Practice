package src;

public class CountNumberOfSubStrings {

    public static void main(String[] args) {
        System.out.println(CountSubString("abc"));
    }

    private static long CountSubString(String s) {
       char[] ch = s.toCharArray();
      int ln = ch.length;
      long sum = ln*(ln+1)/2;

      return sum;

    }
}
