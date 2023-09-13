package src.BinarySearch;

import java.util.ArrayList;
import java.util.Collections;

public class MedianOfSortedArray {
    public static void main(String[] args) {
        int n1[] = {1,3};
        int n2[] =  {2};
       // medianVal(n1 , n2);
        int a[] = {10,20,50,60};
        int b[] = {5,50,50};
        mergeSort(a,b);
    }

    private static void mergeSort(int[] a, int[] b) {
      int m = a.length;
      int n = b.length;
        int i = 0 , j = 0 ;
      while(i < m && j < n){
          if(a[i]<=b[j]){
              System.out.println(a[i] + " ");
              i++;
          }else{
              System.out.println(b[j] + " ");
              j++;
          }
      }
      while(i < m){
          System.out.println(a[i] + " ");
          i++;
      }while(j<n){
            System.out.println(b[j] + " ");
            j++;
        }
    }

    private static void medianVal(int[] n1, int[] n2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int n : n1)
            arr.add(n);
        for(int k : n2)
            arr.add(k);
        Collections.sort(arr);
       // for(int i = 0 ; i < arr.size() ; i++)
            System.out.println(arr.toString());
    }
}
