package src.Recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        int n = 7;
        int k = 3;
        josephusProblem(n,k);
    }

    private static int josephusProblem(int n, int k) {
        if(n==1)
            return 0;
        return josephusProblem(n+k-1,k);
    }
}
