package src.Recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        int n = 3;
        int a = 2;
        System.out.println(powerOfNum(n,a));
    }

    private static int powerOfNum(int n,int a) {
        if(a<0)
            return -1;
        if(a==0)
            return 1;
        return n*powerOfNum(n,(a-1));
    }


}
