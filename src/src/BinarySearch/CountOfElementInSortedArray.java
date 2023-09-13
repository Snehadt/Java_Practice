package src.BinarySearch;

public class CountOfElementInSortedArray {
    public static void main(String[] args) {
        int[] n = {2,4,10,10,10,18,20};
        int num = 10;
        int start = 0;
        int end = n.length-1;
        System.out.println(countElement(n,start,end,num));
    }

    private static int countElement(int[] n, int start, int end, int num) {
        int count = 0;
        int firstOccurenece = firstOccurenceOfNum(n,start,end,num);
        int lastOccurenece = lastOccurenceOfNum(n,start,end,num);
        System.out.println(firstOccurenece+" "+lastOccurenece);
        count = lastOccurenece - firstOccurenece +1;
        return count;
    }

    static int firstOccurenceOfNum(int[] n, int start, int end, int num){
        while(start<=end){
            int mid = start+(end-start)/2;
            if((mid==0|| num > n[mid-1]) && n[mid]==num){
                return mid;
            } else if(n[mid]< num){
                return firstOccurenceOfNum(n,mid+1,end,num);
            }else{
                return firstOccurenceOfNum(n,start,mid-1,num);
            }
        } return -1;
    }

    static int lastOccurenceOfNum(int[] n, int start, int end, int num){
        int x = end;
        while(start<=end){
            int mid = start+(end-start)/2;
            if((mid==x|| num < n[mid-1]) && n[mid]==num){
                return mid;
            } else if(n[mid]> num){
                return lastOccurenceOfNum(n,start,mid-1,num);
            }else{
                return lastOccurenceOfNum(n,mid+1,end,num);
            }
        } return -1;
    }
}
