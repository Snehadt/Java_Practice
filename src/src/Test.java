package src;

public class Test {
    public static void main(String[] args) {
       // String s = "is2 sentence4 This1 a3";
       // test(s);

        String s1 = "Sneha";
        String s2 = new String("Sneha");
        String s3 = "Sneha";
        String s4 = new String("Sneha");

        if(s1==s2)
            System.out.println("s1==s2");
        if(s1==s3)
            System.out.println("s1==s3");
        if(s4==s2)
            System.out.println("s4==s2");

    }


    private static void test(String s) {
       String[] sp = s.split(" ");
       String[] st = new String[sp.length];
       StringBuilder sb = new StringBuilder();
       for(String ss : sp){
          int j = (int)(ss.charAt(ss.length()-1)-'0');
        st[j-1] = ss.substring(0,ss.length()-1);
       }

       for(String sq : st){
           sb.append(sq).append(" ");
       }
        System.out.println(sb.toString());
    }
}