package src;

import java.util.HashSet;
import java.util.Set;

public class DefangIP {
    public static void main(String[] args) {
        String st = "1.1.1.1";
        System.out.println(defangIP(st));
    }

    private static String defangIP(String st) {
        StringBuilder stt = new StringBuilder();
        Set<Character> set = new HashSet<>();
        set.add('.');
        char[] ch =st.toCharArray();
        for(Character c : ch){
            if(!set.contains(c))
                stt.append(c);
            else
                stt.append("[.]");
        } return stt.toString();
    }
//Process 2
    public static String defangIP2(String st){
       return st.replace(".","[.]");
    }
}
