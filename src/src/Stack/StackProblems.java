package src.Stack;

import java.util.*;

public class StackProblems {

    public static void main(String[] args) {
        System.out.println(balancedParanthesis("({[]})"));


    }

    private static boolean balancedParanthesis(String s) {

        Deque<Character> de = new ArrayDeque<>();

        for(int i = 0 ; i <s.length() ; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                de.push(c);

            if (de.isEmpty())
                return false;

            char ch;

            switch (c) {

                case ')':
                    ch = de.pop();
                    if (ch == '{' || ch == '[')
                        return false;
                    break;
                case '}':
                    ch = de.pop();
                    if (ch == '(' || ch == '[')
                        return false;
                    break;

                case ']':
                    ch = de.pop();
                    if (ch == '(' || ch == '{')
                        return false;
                    break;
            }
        }

        return de.isEmpty();
    }
}
