package src;

public class RoundtoNearestMultipleOf10 {
    public static void main(String[] args) {
        int n = 10;
        roundOff(n);
    }

    private static void roundOff(int n) {
        int res = 0;
        int dib = n%10;
        if(dib <= 5){
            int num =n/10;
           res = num*10+0;
        }else if(dib >5 && dib <=9){
            int num =n/10;
            res = num*10+10;
        }else
            res = n;
        System.out.println(res);
    }
}
