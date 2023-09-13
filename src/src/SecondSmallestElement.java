package src;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int n[] = {1,4,2,3,5};
        System.out.println(secondSmallest(n));
    }

    private static int secondSmallest(int[] n) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0 ; i<n.length;i++){
          if(n[i]<first){
              second=first;
              first=n[i];
            }else if(n[i]<second && n[i]!=first){
              second = n[i];
          }
        } return second;
    }
}
