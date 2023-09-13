package src;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackBalancedParathesis {
    public static void main(String[] args) {
        String s = "([{}])}";
       if(isBalancedParathesis(s))
           System.out.println("balanced");
       else
           System.out.println("Unbalanced");
    }

    private static boolean isBalancedParathesis(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int i = 0 ; i< s.length() ; i++){
            char x =s.charAt(i);
            if(x=='(' || x=='{' || x=='[' ) {
                stack.push(x);
                continue;
            }
                if (stack.isEmpty())
                    return false;
                char ch;
                switch(x) {
                    case ')':
                        ch = stack.pop();
                        if (ch=='{' || ch == '[')
                            return false;
                        break;
                    case '}':
                        ch= stack.pop();
                        if (ch=='[' || ch == '(')
                            return false;
                        break;
                    case ']' :
                       ch = stack.pop();
                        if (ch=='{' || ch == '(')
                            return false;
                        break;
                }

        }
        return (stack.isEmpty());
    }
}
