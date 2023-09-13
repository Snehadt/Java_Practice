package src.slidingWindow;

import java.util.*;

public class Practice {
    // https://medium.com/techie-delight/top-problems-on-sliding-window-technique-8e63f1e2b1fa
    public static void main(String[] args) {
       /* String str = "abcbdbdbbdcdabd";
        int k = 2;

        System.out.print(findLongestSubstring(str, k));*/

    /*    String X = "XYYZXZYZXXYZ";
        String Y = "XYZ";

        findAllAnagrams(X, Y);*/

 /*    //Find maximum length sequence of continuous ones
     int n[] = { 0, 0, 1, 0, 1, 1, 1, 0, 1, 1 };
     maxLn(n);*/

        //Find a subarray having the given sum in an integer array

    /*    int n[] =  {0, 5, -7, 1, -4, 7, 6, 1, 4, 1, 10};
        int k = 15;
        //System.out.println(findSubarray(n,k));
       // using sliding window
        //findSubarray(n,k);
        //using hasing
      //  System.out.println(findSubarray1(n,k));
        findSubarray1(n,k);*/

        //Find the maximum sequence of continuous 1’s formed by replacing at-most `k` zeroes by ones
        /*int A[] =  {0, 0, 1, 0, 1, 1, 1, 0, 1, 1};
        int k = 1;
        System.out.println(maxsequence(A,k));*/

        // Find minimum sum subarray of size `k`
     /*   int n[] ={10, 4, 2, 5, 6, 3, 8, 1};
        int k =3;
        System.out.println(        minSumsubarray(n,k)
);*/

        //Find the smallest subarray length whose sum of elements is greater than `k`
        /*int n[] ={1, 2, 3, 4, 5, 6, 7, 8};
        int k = 20;
        System.out.println(lengthOfsmallestSubarray(n,k));;*/

        // Find the count of distinct elements in every subarray of size `k`
       /* int arr[] = { 1, 1, 2, 1, 3 };
        int k = 3;
        numOfdistinctEle(arr,k);*/

        //Print all subarrays of an array having distinct elements
     /*   int A[] = { 5, 2, 3, 5, 4, 3 };
        subArrayswithdistinctEle(A);*/

        //Count distinct absolute values in a sorted array
     //   int n[] = { -1, -1, 0, 1, 1, 1 };
     //   countDistinctVal(n);

        //Find d
        // duplicates within a range `k` in an array
       /* int nums[] = { 5, 6, 8, 2, 4, 6, 9 };
        int k = 4;
        System.out.println(duplicatesinrange(nums,k));;*/

        //FInd whether walmart is present in any order
        String s = "AWMTXYWRMTAALRTS";
        findWhetherPresent(s);
    }

    private static void findWhetherPresent(String s) {
        String p = "WALMART";
        int ptr_ln = p.length();

        Map<Character, Integer> map = new HashMap<>();
        char[] ptr_arr = p.toCharArray();
        for (Character c : ptr_arr) {
            Integer count = map.get(c);
            if (count == null)
                map.put(c, 1);
            else
                map.put(c, ++count);
        }
        int k = map.size();

        int i = 0;
        int j = 0;

        while (j < s.length()) {
            char a = s.charAt(j);
            if (map.containsKey(a)) {
                map.put(a, map.get(a) - 1);
                if (map.get(a) == 0)
                    k--;
            }
            if (j - i + 1 < ptr_ln)
                j++;
            else if (j - i + 1 == ptr_ln) {
                if (k == 0) {
                    System.out.println("exists");
                    break;
                }
                char b = s.charAt(i);
                if (map.containsKey(b)) {
                    map.put(b, map.get(b) + 1);
                    if (map.get(b) == 1)
                        k++;
                }
                i++;
                j++;

            }
        }
    }

    private static boolean duplicatesinrange(int[] nums, int k) {
   Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
           if(set.contains(nums[i]))
               return true;
           set.add(nums[i]);

           if(i >= k)
               set.remove(nums[i-k]);
        }return false;


    }

    private static void countDistinctVal(int[] n) {
        int i = 0;
        if(n[i] == 0)
            System.out.println(0);
       // else if
    }

    private static void subArrayswithdistinctEle(int[] a) {
        int i = 0;
        int j = 0;
        Map<Integer,Integer> map = new HashMap<>();
        while (j < a.length){
            Integer count = map.get(a[j]);
            if(count == null)
                map.put(a[j],1);
            else
                map.put(a[j],++count);

            if(map.get(a[j]) ==1)
                j++;
            else if(map.get(a[j]) > 1){
                while(map.get(a[j])>1) {
                 //   System.out.println(map.size() + " " + i + " " + (j - 1)+" ");
                    printsubArray(a,i,j);

                    System.out.println(" ");
                    map.put(a[i], map.get(a[i]) - 1);
                    if (map.get(a[i]) == 0)
                        map.remove(a[i]);
                    i++;
                }
                j++;
            }
        }
    }

    private static void printsubArray(int[] a,int i, int j) {
        List<Integer> ls = new ArrayList<>();
        for(int l = i ; l <j ; l++)
            ls.add(a[l]);
            System.out.println(ls);

    }

    private static void numOfdistinctEle(int[] arr, int k) {
        int i = 0;
        int j = 0;
        Map<Integer,Integer> map = new HashMap<>();

        while(j < arr.length){
            Integer count = map.get(arr[j]);
            if(count == null)
                map.put(arr[j],1);
            else
                map.put(arr[j],++count);

            if(j-i+1 <k)
                j++;
            else if(j-i+1 ==k){
                System.out.println(map.size());
                map.put(arr[i],map.get(arr[i])-1);
                if(map.get(arr[i])==0)
                    map.remove(arr[i]);
                i++;
                j++;
            }
        }
    }

    private static int lengthOfsmallestSubarray(int[] n, int k) {
        int i = 0;
        int j = 0;
        int sum = 0;
        int min_ln = Integer.MAX_VALUE;
        int start = 0;
        int end = 0;

        while(j < n.length){
            sum = sum + n[j];

           /* if(sum <= k)
                j++;*/
            while (sum >k){

         //   min_ln = Math.min(min_ln,j-i+1);

                if(j-i+1<min_ln){
                    min_ln = j-i+1;
                    start = i;
                    end = j;
                } sum = sum - n[i];
                i++;

            }j++;
        }
        System.out.println(start+" "+end);
        //return (start+" "+end);
        return min_ln;
    }

    private static String minSumsubarray(int[] n, int k) {
        int i =0;
        int j =0;
        int min_sum = Integer.MAX_VALUE;
        int sum =0;
        int start = 0;
        int end = 0;

        while (j < n.length){
            sum = sum+n[j];

            if(j-i+1 <k)
                j++;
            else if(j-i+1 ==k){
             //   min_sum = Math.min(min_sum,sum);
                if(sum < min_sum){
                    min_sum = sum;
                    start = i;
                    end = j;
                }
                sum = sum - n[i];
                i++;
                j++;
            }
        }return (min_sum+" "+start+" "+end);
    }

    private static int maxsequence(int[] a, int k) {
        int i = 0;
        int j =0;
        int max_sq = Integer.MIN_VALUE;
        int count_0 = 0;
        int  ithindex = 0;
        int indexOf0=-1;

        while(j < a.length){
            if(a[j] == 0) {
                ithindex = j;
                count_0++;
            }

                while (count_0 > k) {
                    if (a[i] == 0)
                        count_0--;
                    i++;
                }
               // max_sq = Math.max(max_sq,j-i+1);

            if(j-i+1 > max_sq){
                max_sq = j-i+1;
                indexOf0 = ithindex;
            }
            j++;
        }return indexOf0;
    }

    private static void findSubarray1(int[] n, int k) {
        Map<Integer,Integer> map = new HashMap();
        int sum_so_far = 0;
        int end = -1;
        int start = 0;

        for(int i =0 ; i<n.length ; i++){
            sum_so_far = sum_so_far+n[i];
            if(sum_so_far == k){
                System.out.println(0+" "+i);
                end = i;
            }
            if(map.containsKey(sum_so_far-k)){
               // System.out.println(map.get(sum_so_far-k)+1+" "+i);
                start = map.get(sum_so_far-k)+1;
                end = i;
                for(int m = start ; i < end ; i++)
                    System.out.println(n[m]);
                System.out.println(" ");
            }

            else
                map.put(sum_so_far,i);

        }
        if(end == -1)
            System.out.println("no sum ");
    }

    private static void findSubarray(int[] n, int k) {

        int i = 0;
        int j = 0;
        int sum = 0;
        int begin=0;
        int end = 0;
        int mx_sum = Integer.MIN_VALUE;

        while(j < n.length){
            sum = sum + n[j];

            if(sum < k)
                j++;
            else if(sum == k){
                mx_sum =Math.max(mx_sum,j-i+1);
                sum = sum - n[i];
                i++;

                j++;
            }
            else if(sum > k){
                while(sum > k) {
                    sum = sum - n[i];
                    i++;
                }if(sum == k)
                    mx_sum =Math.max(mx_sum,j-i+1);

                j++;
            }
        }
        if(end - begin < j - i){
            end = j;
            begin = i;
        }
        for(int m = begin ; m < end ; m++)
            System.out.println(n[m]);
    }

    private static int maxLn(int[] A) {
        int left = 0;       // represents the window's starting index
        int count = 0;      // stores the total number of zeros in the current window
        int max_count = 0;  // stores the maximum number of 1's (including 0)

        int max_index = -1;         // stores the index of 0 to be replaced
        int prev_zero_index = -1;   // stores the index of previous zero

        // maintain a window `[left…i]` containing at most one zero
        for (int i = 0; i < A.length; i++)
        {
            // if the current element is 0, update `prev_zero_index` and
            // increase zeros count in the current window by 1
            if (A[i] == 0)
            {
                prev_zero_index = i;
                count++;
            }

            // the window becomes unstable if the total number of zeros in it becomes 2
            if (count == 2)
            {
                // remove elements from the window's left side till
                // we found a zero
                while (A[left] != 0) {
                    left++;
                }

                // remove the leftmost 0 so that window becomes stable again
                left++;

                // decrement count as 0 is removed
                count = 1;
            }

            // when we reach here, window `[left…i]` contains only
            // at most one zero; update the maximum count and index of 0
            // to be replaced if required

            if (i - left + 1 > max_count)
            {
                max_count = i - left + 1;
                max_index = prev_zero_index;
            }
        }

        // return index of 0 to be replaced or -1 if the array contains all 1's
        return max_index;

    }

    private static void findAllAnagrams(String x, String y) {
        if(x.length() < y.length())
            return;
        int i= 0;
        int j = 0;
        Map<Character,Integer> map = new HashMap<>();
        char[] ch = y.toCharArray();
        for(Character c : ch){
            Integer count = map.get(c);
            if(count == null)
                map.put(c,1);
            else
                map.put(c,++count);
        }

        int mp_sz =map.size();
        while(j < x.length()){

           char a = x.charAt(j);
           if(map.containsKey(a)){
               map.put(a,map.get(a)-1);
               if(map.get(a) ==0) {
                  mp_sz--;

               }
           if(j-i+1 <y.length())
               j++;
           else if(j-i+1 == y.length()){
               if(mp_sz == 0)
               System.out.println("Anagram is"+x.substring(i,j+1)+"at index "+i);
               char b =x.charAt(i);
                if(map.containsKey(b)) {
                    map.put(b, map.get(b) + 1);
                    if (map.get(b) == 1)
                        mp_sz++;
                }
               i++;
               j++;


           }

           }
        }
    }

    private static String findLongestSubstring(String str, int k) {
        if(str.length() < k)
            return str;
        Map<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j =0;
        int ans = 0;
        int begin = 0;
        int end = 0;
        while (j < str.length()){
            char ch = str.charAt(j);
            Integer count = map.get(ch);
            if(count == null)
                map.put(ch,1);
            else
                map.put(ch,++count);

            if(map.size() <k)
                j++;
            else if(map.size() == k){

               ans = Math.max(ans,j-i+1);

               j++;
            }
            else if(map.size() > k){
                while(map.size() > k) {
                    char ch1 = str.charAt(i);
                    map.put(ch1, map.get(ch1)- 1);
                    if(map.get(ch1)==0)
                        map.remove(ch1);
                    i++;
                }j++;

            }

            if(end - begin < j - i){
                end = j;
                begin = i;
            }
        }
        return str.substring(begin,end);
    }
}
