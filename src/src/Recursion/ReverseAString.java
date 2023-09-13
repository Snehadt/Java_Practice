/*
package src.Recursion;

public class ReverseAString {
    public static void main(String[] args) {
        String s = "sneha";
        char[] c = s.toCharArray();
        int n = 0;
        reverseAString(c);
    }

    public static char[] reverseAString(char[] c){
        if(c.equals(0))
            return c;
        return reverseAString(rev(c,0));
    }

    static void rev(char[] c , int n){
        if(n>=c.length)
            return;
        rev(c,n+1);
    }
}
*/
