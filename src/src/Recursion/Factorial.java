package src.Recursion;

public class Factorial {
    public static void main(String[] args) {
        int n = 3;
        int k =1 ;
        System.out.println( factorial(n,k));
    }

    private static int factorial(int n,int k) {
        if(n==0 || n==1)
            return k;

        return factorial(n-1,n*k);
    }
}
