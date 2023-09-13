package src;

public class ReverseStringAlernatively {
    public static void main(String[] args) {
        String s = "abcdef";
        int k = 2;
        reverseAlternateString(s,k);
    }
    private static String reverseAlternateString(String s, int k) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % (2 * k) < k)
                res.insert(i - i % (2 * k), s.charAt(i));
            else
                res.append(s.charAt(i));
        }return res.toString();
    }
}
