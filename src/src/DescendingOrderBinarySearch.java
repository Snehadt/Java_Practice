package src;

public class DescendingOrderBinarySearch {
    public static void main(String[] args) {
        int[] n = {9,8,6,4,2,1};
        int ele = 2;
        int start = 0;
        int end = n.length-1;
        System.out.println(descencingSearch(n,ele,start,end));
    }

    private static int descencingSearch(int[] n, int ele,int start,int end) {

        while(start<=end){
            int mid = start + (end-start)/2;
            if(ele == n[mid])
                return mid;
            else if(ele<n[mid]){
                start = mid+1;
               return descencingSearch(n, ele,start,end);
            }
            else if(ele>n[mid]){
                end = mid -1;
               return descencingSearch(n, ele,start,end);
            }
        } return -1;
    }
}
