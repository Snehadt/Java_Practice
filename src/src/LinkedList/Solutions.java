package src.LinkedList;

class Solution {
    static int binarySearch(int[] nums, int low, int high, int val){
        int n=nums.length;
        int res = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]<=val){low=mid+1;}
            else{
                res=mid;
                high=mid-1;
            }
        }
        if(res==-1){return n;}
        return res;
    }
    public static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int idx=0;
        while(idx!=n){
            int i=binarySearch(arr,idx+1,n-1,arr[idx]);
            if(i==n){
                return idx+1;
            }
            idx++;
            arr[idx] = arr[i];
        }
        return idx+1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,2,3,4,5};
        System.out.println(removeDuplicates(arr));;
    }
}

