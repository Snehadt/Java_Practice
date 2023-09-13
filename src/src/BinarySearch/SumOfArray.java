package src.BinarySearch;

public class SumOfArray {
    public static void main(String[] args) {
        int n[] = {5,8,6,9,2,12};
        int x = 14;
        sumOfPair(n,x);
    }

    private static void sumOfPair(int[] n, int x) {
        int a = 0 ;
        int b = n.length -1 ;
        int start = 0 ;
        int end = n.length -1 ;
 /*       while(start <= end){
            int mid = (start + end)/2;

        }*/

        for(int i = 0 ; i < n.length - 1; i++){
            a = n[i];
            int j = i+ 1;
            if(a < x && n[j] == x-a){
                System.out.println( a + " " + n[j]);
            }j++;

            }
        }

    }

