package src.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,8,9,10};
        missingNum(a);
    }

    private static void missingNum(int[] a) {
        int sum = 0;
        int sum1 = 0;
        for(int i = 0 ; i < a.length ; i++){
            sum+=a[i];
        }

        int n = a[a.length-1];
        for(int i = 1 ; i <=n;i++){
            sum1 += i;
        }
        System.out.println("Missing number :"+(sum1-sum));
    }
}
