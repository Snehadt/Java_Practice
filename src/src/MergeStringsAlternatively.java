package src;

public class MergeStringsAlternatively {
    public static void main(String[] args) {
        String word1 = "a";
        String word2 = "pqrs";
        System.out.println(mergeStrings(word1,word2));
    }

    private static String mergeStrings(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        if(word1.length()==0 && word2.length()>0)
            return word2;
        if(word2.length() ==0 && word1.length()>0)
            return word1 ;
        if(word1.length()==0 && word2.length()==0)
            return " ";
        int temp = word1.length();
        int temp2 = word2.length();
        if(word1.length()<word2.length()){
            for(int i = 0 ; i < word2.length();i++){
                if(temp>0){
                    sb.append(word1.charAt(i));
                    temp --;
                }
                sb.append(word2.charAt(i));
            }
        }
        if(word1.length()>word2.length()){
            for(int i = 0 ; i < word1.length();i++){
                sb.append(word1.charAt(i));
                if(temp2>0){
                    sb.append(word2.charAt(i));
                    temp2 --;
                }
            }
        }
        return sb.toString();
    }
}
