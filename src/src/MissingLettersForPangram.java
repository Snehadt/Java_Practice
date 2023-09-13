package src;

public class MissingLettersForPangram {
    public static void main(String[] args) {
        String s = "welcome to geeksforgeeks";
        findMissingCharaters(s);
    }

    private static void findMissingCharaters(String s) {

       String st = s.replace(" ","");
        StringBuilder sb = new StringBuilder();
        int[] a = new int[26];
        int k = 0 ;
        for(int i = 0 ; i< st.length() ; i++){
         k = (int) (st.charAt(i)) - 97;
         if(a[k]==0)
         a[k]=1;
        }

        for(int i = 0 ; i < a.length ; i++)
            if(a[i] == 0)
               // System.out.println( sb.charAt(a[i]));
              sb.append( (char) (i+'a'));
        System.out.print(sb.toString());
    }
}
