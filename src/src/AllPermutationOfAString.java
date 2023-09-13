package src;

public class AllPermutationOfAString {
    public static void main(String[] args) {
        String s = "Sneha";
        
        printPermutn(s, "");

    }

    static void printPermutn(String str, String ans)
    {

        // If string is empty

        if(str.length()==0){
            System.out.println(ans + " ");
            return;
        }

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            String st =str.substring(0,i)+str.substring(i+1);
            printPermutn(st,ans+ch);
        }

    }

}
