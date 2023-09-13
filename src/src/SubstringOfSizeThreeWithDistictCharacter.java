package src;

public class SubstringOfSizeThreeWithDistictCharacter {
    public static void main(String[] args) {
        String s = "xyzzaz";
        System.out.println(substringFunc(s));
    }

    private static int substringFunc(String s) {
        int count = 0;
        for(int i = 1 ; i< s.length()-1 ; i++){
            if(s.charAt(i-1)!=s.charAt(i) &&
            s.charAt(i) != s.charAt(i+1) &&
            s.charAt(i-1) != s.charAt(i+1))
                count++;
        } return count;

    }
}
