package src.Arrays;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = {10,20,30,50,40};
        System.out.println(isSorted(arr));
    }

    private static boolean isSorted(int[] arr) {
        boolean flag = false;
        for(int i = 1 ; i < arr.length ; i++)
        {
            if(arr[i-1]>arr[i])
                flag = false;
            else
                flag =  true;
        }
        return flag;
    }
}
