package src.Arrays;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] n = {2,5,3,1,7};
        int num = 2;
        deleteNumber(n,num);
    }

    private static void deleteNumber(int[] n, int num) {
       // n[num]=Integer.MIN_VALUE;
        int[] a1 = new int[n.length-1];
        System.arraycopy(n,0,a1,0,num);
        System.arraycopy(n,num+1,a1,num,n.length-num-1);
        System.out.println(Arrays.toString(a1));
    }
}
