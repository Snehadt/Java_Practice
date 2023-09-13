package src;

import java.nio.charset.CharacterCodingException;

public class DigitToCharacter {
    public static void main(String[] args) {
        String s = "a1c1e1";
        System.out.println(digitTocharacter(s));
    }

    private static String digitTocharacter(String s) {
       char[] ch = s.toCharArray();
       StringBuilder sb = new StringBuilder();
       /*for(Character c: ch){
           if(Character.isDigit(c)){
              int i = (int)(c-'0');
              char ca = (char)(97+i);
              sb.append(ca);
           }else{
               sb.append(c);
           }

       }*/
      //  if(Character.isDigit(ch[0])
        for(int i = 1 ; i<ch.length;i++){
            if(Character.isDigit(ch[i])){
               int asciiVal= (int) (ch[i-1]-'0');
              int balanceAcii = asciiVal+(int)ch[i];
               char temp = (char)balanceAcii;
               sb.append(temp);
            }else{
                sb.append(ch[i]);
            }
        }
        return ch[0]+sb.toString();
    }

}
