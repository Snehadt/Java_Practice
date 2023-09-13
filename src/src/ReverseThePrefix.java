package src;

public class ReverseThePrefix {
    public static void main(String[] args) {
        String word = "abcdefd";
        char chh = 'd';
        System.out.println(reversePrefix(word,chh));
    }

    private static String reversePrefix(String word, char chh) {
        // char[] c = word.toCharArray();
        String prefixString = "";
        String actualString = "";
        String finalString = "";
        StringBuilder st = new StringBuilder();
        int characterIndex = word.indexOf(chh);
       return new StringBuilder (word.substring(0,word.indexOf(chh)+1)).reverse().toString()+word.substring(word.indexOf(chh));

      /*  for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == chh){
                prefixString = word.substring(0, word.length() - characterIndex);
                actualString=   word.substring(word.length() - characterIndex);
            }

            finalString = reverseString(prefixString)+actualString;


        } return finalString;*/
    }

    public static String reverseString(String st)
    {
        if(st==null|| st.length()<1)
            return st;
        else
          return  reverseString(st.substring(0,st.length()-1));


    }

}
