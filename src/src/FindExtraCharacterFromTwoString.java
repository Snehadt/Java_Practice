package src;

import java.util.Arrays;

public class FindExtraCharacterFromTwoString {
    public static void main(String[] args) {
        String strA = "abcd";
        String strB = "cbdae";
       // char ext = findextraCharacter(strA, strB);
        //System.out.println(ext);
        System.out.println(secondMethod(strA,strB));
    }

    private static char secondMethod(String strA, String strB) {
        char[] charA = strA.toCharArray();
        char[] charB = strB.toCharArray();
        Arrays.sort(charA);
        Arrays.sort(charB);
        char extraChar = 0;
        for(int i = 0 ; i<charA.length;i++){
            if(charA[i]==charB[i]){

                continue;
            }else{
                extraChar=charB[i];
                break;
            }
        } if(extraChar==0){
            extraChar = charB[charB.length-1];
        } return extraChar;
    }

    private static char findextraCharacter(String strA, String strB) {
        String largerString = "";
        String smallerString = "";
        if (strA.length() < strB.length()) {
            smallerString = strA;
            largerString = strB;
        } else {
            smallerString = strB;
            largerString = strA;
        }
        int smallercode = 0;
        int largercode = 0;

        for (int i = 0; i < smallerString.length(); i++) {
            smallercode += smallerString.charAt(i);
            largercode += largerString.charAt(i);
        }
        int intChar = largercode - smallercode;
        return ((char)intChar);
    }
}
