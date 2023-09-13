package src.Recursion;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(sumOfNum(n));
    }

    private static int sumOfNum(int n) {
        if(n==0)
            return n;
        return n+sumOfNum(n-1);
    }
}
