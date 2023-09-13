package src;

public class FirstAndLastOccureneceOfElement {
    public static void main(String[] args) {
        int[] n = {2,4,10,10,10,18,20};
        int num = 10;
        int start = 0;
        int end = n.length-1;
     //   firstOccurence(n,num);
        System.out.println(firstAndLastOccurenece(n,start,end,num));
    }




    private static int firstAndLastOccurenece(int[] n ,int start, int end, int num) {
        int firstOccurence = 0;
        int count = 0;
            while(start<=end){
                int mid = start +(end-start)/2;
                if((mid== 0 || num > n[mid-1]) && n[mid]==num){
                    return mid;
                }
                else if(num> n[mid]){
                    return firstAndLastOccurenece(n,(mid+1),end,num);

                }
                else{
                    return firstAndLastOccurenece(n,start,(mid-1),num);

                }
            } return -1;
    }
}
