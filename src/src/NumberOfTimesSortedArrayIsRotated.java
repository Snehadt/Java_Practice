package src;

public class NumberOfTimesSortedArrayIsRotated {
    public static void main(String[] args) {
        int[] n = {11,18,20,2,5,7,9};
        int start = 0;
        int end = n.length-1;
            rotationArray(n,start,end);
        }

    private static void rotationArray(int[] n,int start,int end) {
        int N= end;
        while(start<=end){
            int mid = start +(end-start)/2;
            int next = (mid+1)%N;
            int prev = (mid+N-1)%N;
            if(n[mid]<prev && n[mid]<next){

            }
               // return mid;
        }
    }
}
