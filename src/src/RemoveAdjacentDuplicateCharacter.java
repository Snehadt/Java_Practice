package src;

public class RemoveAdjacentDuplicateCharacter {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeAdjacentDuplicate(s));
    }

    private static String removeAdjacentDuplicate(String s) {
        char[] ch =s.toCharArray();
        StringBuilder stt = new StringBuilder();
        for(int i =0 ; i< ch.length-1 ; i++){
           // stt.append(s.charAt(i));
            if(s.charAt(i)==s.charAt(i+1)){
                i=i+2;
            }
            else{
                stt.append(s.charAt(i));
            }
        } return stt.toString();
    }
}
