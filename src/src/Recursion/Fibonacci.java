package src.Recursion;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(fib(n));
    }

    private static int fib(int n) {

        if(n==0 || n==1)
            return n;
        return fib(n-1)+fib(n-2);
    }
}
