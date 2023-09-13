package src;

public class ShuffledSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        System.out.println(suffleSentence(s));
    }

    private static String suffleSentence(String s) {
        String[] st =s.split(" ");
       int size = st.length;
       int i = 0 ;
       String[] ch = new String[size];
       StringBuilder stt = new StringBuilder();
       for(String sm : st){
          i = (int)(sm.charAt(sm.length()-1)-'0') ;
          ch[i-1]= sm.substring(0,sm.length()-1);
       }
       for(int j = 0 ; j<ch.length ; j++){
            stt.append(ch[j]).append(" ");
       } return stt.toString();
    }
}
