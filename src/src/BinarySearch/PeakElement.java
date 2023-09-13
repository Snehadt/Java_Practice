package src.BinarySearch;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {5,10,20,15,7};
        peakElement(arr);
    }

    private static void peakElement(int[] arr) {
        if(arr[0] > arr[1])
            System.out.println("Peak Element :"+arr[0]);
        for(int i = 1 ; i < arr.length -1 ; i++){
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                System.out.println("Peak Element :"+arr[i]);
            }
        }
    }
}
