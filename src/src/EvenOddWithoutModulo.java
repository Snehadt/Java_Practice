package src;

public class EvenOddWithoutModulo {
    public static void main(String[] args) {
        int num = 34;
        if(evenOddFunc(num)==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }

    private static int evenOddFunc(int num) {
        return (num & 1);
    }
}
