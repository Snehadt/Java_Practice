package src;

import javax.print.DocFlavor;

public class GetInitialsOfString {
    public static void main(String[] args) {
        String s = "Prabhat Kumar Singh";
        getInitials(s);
    }

    private static void getInitials(String s) {
       String[] st = s.split(" ");
       StringBuilder sb = new StringBuilder();
        System.out.println(s.charAt(0));
       for(int i = 0 ; i< s.length() ; i++){
           if(s.charAt(i)==' ')
               System.out.print(Character.toUpperCase(s.charAt(i+1)));
       }

    }
}
