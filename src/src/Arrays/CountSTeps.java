package src.Arrays;

public class CountSTeps {
    public static void main(String[] args) {
        int N = 4;
        int count = 0;
        countSTeps(N,count);
    }

    private static void countSTeps(int n,int count) {

        while(n>1){
            if(n%2==0){
                n=n/2;
            }else{
                n=n+1;
            }count=count+1;
           // countSTeps(n,count);
        }
        System.out.println(count);

    }
}
