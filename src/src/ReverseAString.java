package src;

public class ReverseAString {

    public static void main(String[] args) {
         String s = "Sneha";
         String a = "";
         int ln = s.length();
         for(int i = ln-1; i >=0 ; i --){
            a= a+ s.charAt(i);
         }
        System.out.println(a);
    }
}
