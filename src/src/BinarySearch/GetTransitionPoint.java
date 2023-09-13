package src.BinarySearch;

public class GetTransitionPoint {
    public static void main(String[] args) {
        int n[] = {1,1,1,1,0};
        int num = 5;
        //System.out.println(transitionPoint(n,num));
        System.out.println(transitionPoint(n,num));
    }

    int transitionPoint1(int arr[], int n) {
        // code here
        int s=0;
        int e=n-1;
        while(s<=e){
            int mid=(s+e)/2;
            if(arr[mid]==0)
                s=mid+1;
            else
                e=mid-1;
        }

        if(e==n-1)
            return -1;
        else
            return s;
    }
    private static int transitionPoint(int[] n, int num) {
        int start = 0;
        int end = num-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(n[mid]==0 && n[mid+1]==1)
                return mid+1;
            else if(n[mid]==0 && n[mid+1]==0)
                start = mid+1;
            else
                end = mid -1;
        } return -1;
    }
}
