package src.Arrays;

import java.util.Arrays;

public class DeleteOperation {
    public static void main(String[] args) {
        int[] a = {2,4,1,6,8,5};
        int x = 2 ;
        int arr[] = deleteOperation(a,x);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] deleteOperation(int[] a, int x) {
        int arr[] = new int[a.length-1];
        for(int i = 0 , k = 0 ;i < a.length ; i++){
            if(a[i]==x)
                continue;
            else{
                arr[k++]=a[i];
            }
        }
        return arr;
    }
}
