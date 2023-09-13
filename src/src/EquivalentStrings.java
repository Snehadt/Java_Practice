package src;

public class EquivalentStrings {
    public static void main(String[] args) {
        String[] word1 = {"ab", "c"}, word2 = {"a", "bc"};  
        System.out.println(equivalentStrings(word1, word2));
    }

    static boolean equivalentStrings(String[] word1, String[] word2) {
        StringBuilder st1 = new StringBuilder();
        StringBuilder st2 = new StringBuilder();
        boolean flag = false;
        for (String s1 : word1) {
            st1.append(s1);
        }
        // st1.toString();
        for (String s2 : word2)
            st2.append(s2);
        // st2.toString();
      /*  int i = 0;
        while (i < st1.length()) {
            if (st1.charAt(i) == st2.charAt(i)) {
                i++;
                flag = true;
            } else {
                i++;
                flag = false;
            }
        }
        return flag;*/
        return st1.toString().equals(st2.toString());
    }
}
