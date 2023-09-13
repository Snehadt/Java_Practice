package src;

public class CountOfElementInSortedArray {
    public static void main(String[] args) {
        int[] n = {2,4,10,10,10,18,20};
        int num = 10;
        int start = 0 ;
        int end = n.length-1;
        System.out.println(countOccurence(n,start,end,num));
    }

    private static int countOccurence(int[] n, int start, int end, int num) {
        int count = 0;
        while(start<=end){
            int mid = start +(end-start)/2;
            if((mid==0 || num< n[mid]) && num == n[mid]){
                count = count+1;
                return count;
            } else if(num>n[mid]){
                return countOccurence(n,mid+1,end,num);
            }else{
                return countOccurence(n,start,mid-1,num);
            }
        }return -1;
    }
}
