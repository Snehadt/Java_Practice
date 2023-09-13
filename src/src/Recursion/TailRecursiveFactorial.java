package src.Recursion;

public class TailRecursiveFactorial {
    public static void main(String[] args) {
        int n = 5;int k =1;
        System.out.println(factorialFunc(n,k));
      //  factorialFunc(n);
    }

    private static int factorialFunc(int n, int k) {
        if(n==0 || n==1)
            return k;
        return (factorialFunc(n-1,k*n));
    }
}
