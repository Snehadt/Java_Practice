package src.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class test {
    public static void main(String[] args) {
        int[] a = {3,6,2,1,4,9,0};
        int[] b = {0,1,0,1,1,0,0};
       // System.out.println(largestElement(a));
        //   System.out.println( secondLargest(a));
      //    int[] ab = reverseArray(a);
     //   System.out.println(Arrays.toString(ab));
       // System.out.println(maxDifferenec(a));
      //  int[] cc =zerostoFirst(b);
      //  System.out.println(Arrays.toString(cc));
      //  int[] ab = {-2,-3,4,-1,-2,1,5,-3};
      //  System.out.println(sumOfContinuousSUbArray(ab));
       /* int arr[] = {1,5,7,-1};
        int sum = 7;
        isSumPresent(arr,sum);*/
       /* int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        maxFrequency(arr);*/
/*        int s = 67;
        sumSingleDigit(s);*/
      /*  int[] n = {2, 3, 10, 6, 4, 8, 1,9};
        maxSum(n);*/
   /*     int n[] = {4,5,2,25};
        nextGreaterElement(n);*/
     /*   int m[] = {-2,-3,4,-1,-2,1,5,-3};
        largestCOntiguosSum(m);*/
    /*    int n[] = {14,12,8,7,4,5};
        maxLengthOddEven(n);*/
 /*       int n[] = {10,10,10,25,30,30};
        frequenciesInSortedArray(n);*/
   /*     int n[] = {1,5,3,8,12};
        stockBuySell(n);*/

   /*     int n[] = {3,0,1,2,5};
        waterTrapping(n);*/

      /*  int n [] = {1,1,1,1,1};
        maxConsequetive1s(n);*/

      /*  int n[] = {2,3,-8,7,-1,2,3};
        maxSubArraySum(n);*/

      /*  int n[] = {5,-2,3,4};
        maxCircularSUbArray(n);*/

      /*  int n[]= {8,3,8,8,8};
        majorityElement(n);*/
        
        int n[] = {10,20,30,40,50,50,60};
        int x = 50;
        System.out.println(presenceOfElementSortedArray(n,x));
    }

    private static int presenceOfElementSortedArray(int[] n, int x) {
        int start = 0;
        int end = n.length -1;

        while(start<end){
            int mid = (start+end)/2;
         /*   if(n[mid]==x )
                return mid;*/
     /*        if (n[mid]<x)
                start = mid+1;
            else if(n[mid]>x) {
                end = mid - 1;
            }*/
            if (n[mid]>x)
                end = mid-1;
            else if(n[mid]<x) {
                start = mid + 1;
            }
            else{
                if(mid==0 || n[mid-1]!=n[mid])
                    return mid;
                else{
                    end = mid - 1;
                }
             }
        }return -1;
    }

    private static void majorityElement(int[] n) {
        int borderLine = n.length/2;
        int count = 0 ;
        int ele = n[0];
        int i = 0 ;
        int j = i+ 1;
        while( i < n.length-1 && j<n.length ){
            if(n[i] == n[j]){
                count ++ ;
                j++;
            }else{j++;
            }i++;

        }
        System.out.println(n[i]+" "+count);
    }

    private static void maxCircularSUbArray(int[] n) {
        int max_curr = n[0];
        int max_sum = n[0];
        int min_curr = n[0];
        int min_sum = n[0];
        int arr_sum = 0 ;
        for(int i = 1 ; i < n.length ; i++){
          min_curr =  Math.min(n[i],min_curr+n[i]);
          min_sum = Math.min(min_sum,min_curr);
        } System.out.println(min_sum);
        for(int i = 0 ; i < n.length ; i++){
            arr_sum = arr_sum + n[i];
        }
        int sum_circular = arr_sum - min_sum;
        for(int i = 1 ; i < n.length ; i++){
            max_curr = Math.max(n[i],max_curr+n[i]);
            max_sum = Math.max(max_sum,max_curr);
        }
        int res = Math.max(max_sum,sum_circular);
        System.out.println(res);
    }

    private static void maxSubArraySum(int[] n) {
        int max_current = n[0];
        int max_sum = n[0];
        for(int i = 1 ; i < n.length ; i++){
            max_current = Math.max(n[i],max_current+n[i]);
            max_sum = Math.max(max_sum,max_current);
        }
        System.out.println(max_sum);
    }

    private static void maxConsequetive1s(int[] n) {
        int sum = 1;
        int res = 1 ;
        for(int i = 1 ; i < n.length ; i++){
            if(n[i-1]==n[i] && n[i]==1){
                sum = sum +1 ;
              res =   Math.max(sum , res );
            } else {
                sum = 1;
            }

        } System.out.println(res);
    }

    private static void waterTrapping(int[] n) {
        int sum = 0 ;
        int lmax= n[0];
        int rmax = n[n.length-1];
        int borderL = min(lmax,rmax);
        for(int i = 1 ; i < n.length-1 ; i++){
            sum = sum + Math.abs(borderL- n[i]);
        }
        System.out.println(sum);
    }

    private static void stockBuySell(int[] n) {
        int maxProfit = 0 ;
        int max_sum = 0 ;
        for(int i = 1 ; i < n.length ; i++){
            if(n[i-1]<n[i]){
                maxProfit = n[i]- n[i-1];
                max_sum = max_sum + maxProfit ;

            }else{
                maxProfit = 0;
            }
        }
        System.out.println(max_sum);
    }

    private static void frequenciesInSortedArray(int[] n) {
        int count = 1 ;
        for(int i = 1 ; i < n.length ; i++){
            if(n[i-1]==n[i]){
                count ++ ;
            } else {
                count = 1 ;
            }
            System.out.println( n[i]+" "+count);
        }
    }

    public static void maxLengthOddEven(int[] n){
        int len = 0;
        for(int i = 1 ; i < n.length ; i++){
            if((n[i]%2 == 0 && n[i-1]%2!=0) || (n[i]%2 != 0 && n[i-1]%2==0)){
                len++;
            }

        }System.out.println(len);
    }

    private static void largestCOntiguosSum(int[] a) {
      int max_till_now = a[0];
      int max_sum = a[0];
      for(int i = 1 ; i < a.length ; i++){
         max_till_now =  Math.max(a[i],max_till_now+a[i]);
         max_sum = Math.max(max_sum,max_till_now);
      }
        System.out.println(max_sum);
    }

    private static void nextGreaterElement(int[] n) {
        int a = n[0];


        for(int i = 0 ; i <n.length ; i++){
            int j = i + 1;
            if(n[i]<n[j]){
                System.out.println(n[i]+" "+n[j]);
            }else{
                j++;
                continue;
            }
        }
    }

    private static void maxSum(int[] n) {
        int maxEle = Integer.MIN_VALUE;
        for(int i = 0 ; i < n.length -1 ; i++){
            if(n[i]<n[i+1])
           maxEle = Math.max(maxEle,n[i+1]-n[i]);
        }
        System.out.println(maxEle);
    }

    private static void sumSingleDigit(int s) {
        int sum = 0 ;
        int n = s ;
            while(s>0||sum>9){
                if(s==0){
                    s= sum;
                    sum=0;
                }
                sum = sum+ (s%10);
                s=s/10;
            }

        System.out.println(sum);
    }

    private static void maxFrequency(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer inti : arr){
            Integer count = map.get(inti) ;
            if(count==null){
                map.put(inti,1);
            }else{
                map.put(inti,++count);
            }
        }int max_freq = arr.length/2;
        Set<Map.Entry<Integer,Integer>> set1 = map.entrySet();
        for(Map.Entry<Integer,Integer> st : set1){
            if(st.getValue()>max_freq){
                System.out.println("exists :"+st.getKey());
            }
        }
    }

    private static void isSumPresent(int[] arr, int sum) {
        int cur_pointer = 0;
        for(int i = cur_pointer+1  ; i < arr.length ; i++){
           int req = sum - arr[cur_pointer];
           if(req== arr[i]){
               System.out.println("{"+arr[cur_pointer]+","+req+"}");
           }cur_pointer++;
       }
    }

    private static int sumOfContinuousSUbArray(int[] ab) {
        int max_sum = ab[0] ;
        int current_max = ab[0] ;
        for(int i = 1 ; i < ab.length ; i++){
            current_max = Math.max(ab[i],current_max+ab[i]);
            max_sum =Math.max(current_max,max_sum);
        } return max_sum ;
    }

    private static int maxDifferenec(int[] a) {
        int res = a[1]-a[0];
        int minVal = a[0];
        for(int j = 1 ; j < a.length ; j++){
           res = max(res,a[j]-minVal);
          minVal = min(minVal,a[j]) ;
        } return res;
    }

    private static int[] zerostoFirst(int[] b) {
        int[] a = new int[b.length];
        int j = 0 ;
        int k = a.length-1;
        for(int i = 0 ; i < b.length ; i++){
            if(b[i]==0){
                a[j++]= b[i];
            }else{
                a[k--]=b[i];
            }
        } return a;
    }

    private static int[] reverseArray(int[] a) {
        int[] rev = new int[a.length];
        int j = 0 ;
        for(int i = a.length -1 ; i >= 0 ; i--){
            rev[j++]=a[i];
        } return rev;
    }

    private static int secondLargest(int[] a) {
        int maxElement = Integer.MIN_VALUE;
        int secondLargestEle = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]>maxElement){
                secondLargestEle = maxElement ;
                maxElement = a[i];
            }
        } return secondLargestEle;
    }

    private static int largestElement(int[] a) {
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            if(a[i]>maxElement)
                maxElement = a[i];
            else
                continue;
        }
        return maxElement;
    }
}
