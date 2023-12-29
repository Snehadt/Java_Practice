package src.DynamicProg;

public class LeetCode {
    public static void main(String[] args) {
        int n = 5;
       Integer[] x = countBits(n);
       for(int i = 0 ; i < x.length ;i++)
           System.out.println(x[i]);
    }

    private static Integer[] countBits(int n) {
        Integer[] t = new Integer[n+1];

        t[0] = 0;
        for(int i = 1 ; i <= n ; i++){
            int s = getBinary(i);
            t[i] = s;
        } return t;
    }

    private static int getBinary(int i) {
        int[] n = new int[32];

        int j = 0;
        while(i > 0){
            n[j]  =i%2;
            i = i/2;
            j++;
        }
        int counter = 0;
        for(int k = j-1; k >=0;k--){
            if(n[k] == 1)
                counter++;
        } return counter ;
    }
}
