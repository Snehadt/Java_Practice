package src.Recursion;

//import static java.lang.Math.max;

public class RopeCutting {
    public static void main(String[] args) {
        int n = 23;
        int a = 12;
        int b = 14;
        int c = 11;
        System.out.println(ropeCutting(n,a,b,c));
    }

    private static int ropeCutting(int n, int a, int b, int c) {
        if(n==0)
            return 0;
        if(n<-1)
            return -1;
       int res = Math.max(ropeCutting(n-a,a,b,c),Math.max(ropeCutting(n-b,a,b,c),ropeCutting(n-c,a,b,c)));
      if(res == -1)
          return -1;
       return res+1;
    }
}
