package src.BinarySearch;

public class AllocateMinPages {
    public static void main(String[] args) {
        int n[] = {10,20,30,40};
        int s = 2;
        allocatePage(n,s);
    }

    private static void allocatePage(int[] n, int s) {
        int start = 0 ;
        int end = n.length ;
        int sum = 0 ;
        int sum1 = 0 ;
        int x = Integer.MAX_VALUE ;
        while(start <= end){
            int mid = (start+end)/2;
            for(int i = 0 ; i<mid; i++){
               sum = sum+n[i];
            }
            for(int i = mid ; i < n.length ; i++)
                sum1 = sum1 + n[i];
           x =  Integer.min(x ,sum1-sum);

        }
    }
}
