package src.BinarySearch;

public class FisrstOccurenceOfEle {
    public static void main(String[] args) {
/*        int n[] = {10,20,30,30,30,40,50};
        int x = 30;
       // System.out.println(firstOccurence(n,x));
       // System.out.println(lastOccurence(n,x));
       // System.out.println(numberOfOccurence(n,x));*/
        int n[] = {0,0,1,1,1,1,1};
        System.out.println(countNumberOfOne(n));
    }

    private static int countNumberOfOne(int[] n) {
        int start = 0 ;
        int end = n.length -1 ;
        int nt = n.length ;
        int firstOcc = 0;
        while(start <= end){
            int mid = (start+end)/2;
            if(n[mid] == 0)
                start = mid +1;
            else {
                if(mid == 0 || n[mid -1]!= n[mid]){
                   return (nt - mid);
                }else {
                    end = mid - 1 ;
                }
            }
        }
        return 0 ;
    }

    private static int numberOfOccurence(int[] n, int x) {
        int lastOcc = lastOccurence(n,x);
        int firstOcc = firstOccurence(n,x);
        int occurence = 0 ;
        if(firstOcc == -1 ){
            return 0 ;
        }else{
            occurence = lastOcc - firstOcc + 1;
        }

        return occurence;
    }

    private static int lastOccurence(int[] n, int x) {
        int start = 0 ;
        int end = n.length -1;
        while (start<end){
            int mid = (start+end)/2;
            if(n[mid]>x){
                end = mid -1 ;
            }else if(n[mid]<x){
                start = mid +1 ;
            }else{
                if(mid == n.length -1 || n[mid+1]!=n[mid])
                    return mid ;
                else
                    return mid + 1;
            }
        }return -1;
    }

    private static int firstOccurence(int[] n, int x) {
        int start = 0 ;
        int end = n.length -1;
        while(start<end){
            int mid = (start+end)/2;
            if(n[mid]>x){
                end = mid-1;
            }else if (n[mid]<x){
                start = mid+1;
            }else{
                if(mid == 0 ||  n[mid-1] != n[mid]){
                    return mid;
                }else{
                    return mid -1;
                }
            }
        } return -1;
    }

}
