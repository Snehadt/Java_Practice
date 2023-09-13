package src.Arrays;

public class SnakePattern2D {
    public static void main(String[] args) {
         int n[][] = {{1,2,3,4},
                 {5,6,7,8},
                 {9,10,11,12},
                 {13,14,15,16}};

        // snakePattern(n);
         boundryPattern(n);

    }

    private static void boundryPattern(int[][] n) {
        int row = n.length;
        int col = n[0].length ;
        for(int i = 0 ; i < row ; i ++){
            for(int j = 0 ; j < col ; j++){
                if(i == 0 || i == row ){
                    System.out.println(n[i][j]);
                }else if ( j == col){
                    System.out.println(n[i][j]);
                }
            }
        }
    }

    private static void snakePattern(int[][] n) {
     for(int i = 0 ; i < n.length ; i++){
            if(i%2 == 0){
                for(int j = 0 ; j < n[i].length ; j++){
                    System.out.println(n[i][j] + " ");
                }
            }else{
                for(int j = n[i].length -1 ; j >= 0 ; j--){
                    System.out.println(n[i][j] + " ");
                }
            }
        }
    }
}
