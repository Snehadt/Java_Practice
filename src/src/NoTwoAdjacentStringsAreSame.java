package src;

import java.util.Stack;

public class NoTwoAdjacentStringsAreSame {
    public static void main(String[] args) {
        String s = "aaabc";
        System.out.println(noTwoAdjacentStrings(s));
    }

    private static String noTwoAdjacentStrings(String s) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        Stack stack = new Stack();
        if(s.length()<=2)
            System.out.println("not possible");
        else {
            for(int i = 0 ; i< ch.length ; i++){

            }

        } return sb.toString();
    }
}
