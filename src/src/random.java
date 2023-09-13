package src;

public class random {
    public static void main(String[] args) {
        int[] a = {2,6,3,7,8,9};
       // reverseHalfofArray(a);
        System.out.println(findThirdLargest(a));
    }

    private static int findThirdLargest(int[] a) {
        int first = 0;
        int second = 0;
        int third = 0;
        for(int i = 0 ;i<a.length ; i++){
            if(a[i]>first){
                third = second ;
                second = first;
                first = a[i];
            }else if(a[i]>second && a[i]<first){
                third = second ;
                second = a[i];
            }else if(a[i]>third && a[i]<first){
                third = a[i];
            }
        } return third;
    }

    private static void reverseHalfofArray(int[] a) {
        int n = a.length/2;
        int start = 0 ;
        int end = n-1;
        for(int i = 0 ; i < n ; i++){
            int t  = a[i];
            a[i]= a[n-1-i];
            a[n-1-i]=t;
        }
        for(int i = 0 ; i < a.length ; i++)
            System.out.println(a[i]);
    }
}
