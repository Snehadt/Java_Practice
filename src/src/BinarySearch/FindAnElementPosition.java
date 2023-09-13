package src.BinarySearch;

public class FindAnElementPosition {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,40,50};
        int x = 20;
        int low = 0;
        int high = a.length -1;
        System.out.println(binarySearchElements(a,x,low,high));
    }

    private static int binarySearchElements(int[] a, int x,int low,int high) {

        int mid = low+(high-low)/2;
        while(low<=high){
            if(a[mid]==x||mid==0)
                return mid ;
            else if(a[mid]>x)
                return binarySearchElements(a,x,low,mid-1);
            else
                return binarySearchElements(a,x,mid+1,high);
        }
        return -1;
    }
}
