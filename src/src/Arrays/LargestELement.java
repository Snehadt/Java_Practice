package src.Arrays;

public class LargestELement {
    public static void main(String[] args) {
        int[] arr = {20,10,50,30,5,60,50};
        largestElementFunc(arr);
    }

    private static void largestElementFunc(int[] arr) {
        if(arr.length<=2)
            return ;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int index[] = new int[2];
        for(int i = 0 ; i< arr.length ; i++){
            if(arr[i]>largest){
                secondLargest=largest;
                largest = arr[i];
            }
           else{
               if(arr[i]>secondLargest && arr[i]!=largest){
                   secondLargest=arr[i];
                   index[0] = i;
               }

            }
        }
        System.out.println(secondLargest+" "+index);
    }
}
