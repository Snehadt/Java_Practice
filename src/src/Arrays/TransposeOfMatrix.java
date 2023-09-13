package src.Arrays;

public class TransposeOfMatrix {

    public static void main(String[] args) {
        int n[][] = {{1,2,3,4},
                {4,5,6,7},
                {8,9,10,11},
                };
       // transposeOf(n);
       // spiralform(n);
        int x = 5;
        serachInRowWiseCOlWise(n,x);
    }

    private static void serachInRowWiseCOlWise(int[][] n, int x) {

        int row = n.length;
        int col = n[0].length;
        int j = col-1;
        int i = 0;
        while(i>=0 && i <= row){
            if(n[i][col] > x){
                while(j>=0)
                {
                    if(n[i][j]>x){
                        j--;
                    }else if(n[i][j]==x)
                        System.out.println(i+" "+j);

                }
            } else{
                i++;
            }
        }

    }

    private static void spiralform(int[][] n) {
       int row = n.length;
       int col = n[0].length ;
        int left = n[0][0];
        int right = n[0][col];
        int bottom = n[row][col];
        int end = n[row][0];

        while(left<=right){
                System.out.println(n[left][right]);
                right--;
        }

        while(left<=right){
            System.out.println(n[left][right]);
            left++;
            right--;
        }

    }

    private static void transposeOf(int[][] n) {
        int rows = n.length;
        int col = n[0].length ;

        for(int i = 0 ; i < col ; i++){
            for(int j = 0 ; j < rows ; j++){
                System.out.println(n[j][i]);
            }
        }
    }
}
