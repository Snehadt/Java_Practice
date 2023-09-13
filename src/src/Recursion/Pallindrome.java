package src.Recursion;

public class Pallindrome {
    public static void main(String[] args) {
        String s = "aaabaaaa";
        int start = 0 ;
       int size = s.length();
       int end = size-1;
        System.out.println(isPallindrome(s,start,end));
    }

    private static boolean isPallindrome(String s,int start, int end) {
        if(start>=end)
            return true;
        return (s.charAt(start)==s.charAt(end)) && isPallindrome(s,start+1,end-1);
    }
}
