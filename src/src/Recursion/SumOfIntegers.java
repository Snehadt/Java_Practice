package src.Recursion;

public class SumOfIntegers {
    public static void main(String[] args) {
        int a = 117;

        System.out.println(sumOfIntegers(a));
    }

    private static int sumOfIntegers(int a) {
        if(a==0 || a < 0)
            return 0;
        return a%10 + sumOfIntegers(a/10);
    }
}
