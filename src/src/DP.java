package src;

public class DP {
    public static void main(String[] args) {
        int n[] = {3,3,7,8,10};
        int s = 20;
        System.out.println(subsetSum(n,s));
       // equalSumPartition(n);
    }

 /*   private static boolean equalSumPartition(int[] n) {
        int sum = 0 ;
        int size = n.length ;
        int partition = 0;
        for(int i = 0 ; i < n.length ; i++)
            sum = sum + n[i];

        if(sum %2 == 0) {
        partition = sum/2;

        boolean t[][] = new boolean[size+1][partition+1];
        for(int i = 0 ; i < partition +1 ; i++)
            t[0][i] = false;
        for(int i = 0 ; i < size +1 ; i++)
            t[i][0] = true;

        for(int i = 1 ; i < size+1 ; i++){
            for(int j = 1 ; j < partition +1 ; j++){
                if(n[i-1]<=j){
                    t[i][j] = t[i-1][j] || t[i-1][j-n[i-1]];
                }else{
                    t[i][j] = t[i-1][j];
                }
            }
        } }else{
            return false ;
        }     return t[size][partition] ;  }

}*/

    private static boolean subsetSum(int[] n, int s) {
       int size = n.length ;
       boolean  t[][] = new boolean[size+1][s+1];

       for(int i = 0 ; i < s+1 ; i++)
           t[0][i] = false;
       for(int i = 0 ; i < size+1 ; i++)
           t[i][0] = true ;

       for(int i = 1 ; i < size+1 ; i++){
           for(int j = 1 ; j < s+1 ; j++){
               if(n[i-1]<=j){
               t[i][j] = t[i-1][j-n[i-1]] || t[i-1][j];
               }else{
                   t[i][j] = t[i-1][j];
               }
           }
       }
            return t[size][s];
    }
}
