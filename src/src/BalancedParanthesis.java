package src;

public class BalancedParanthesis {
    public static void main(String[] args) {
        //String s = "LRLLRRLR";
        String s = "RLRLLRRLR";
        //System.out.println(balancedParanthesis(s));
        System.out.println(blanacedParanthesis2(s));
    }

    private static int blanacedParanthesis2(String s) {
        int balancedCount = 0;
        int count = 0;

        for(int i = 0; i<s.length();i++)

        {
            char current = s.charAt(i);
            if(current=='L')
                count++;
            else if(current=='R')
                count--;
            if(count==0)
                balancedCount++;
        }
        return balancedCount;
    }

    private static int balancedParanthesis(String s) {
        int res = 0, cnt = 0;
        for (int i = 0; i < s.length(); ++i) {
            cnt += s.charAt(i) == 'L' ? 1 : -1;
            if (cnt == 0) ++res;
        }
        return res;
    }


}
