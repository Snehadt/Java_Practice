package src.slidingWindow;


import java.util.*;

import static java.lang.Math.max;

public class FixedSizeSW {

    public static void main(String[] args) {
       /* int arr[] = {2,5,1,8,2,9,1};
        int win_size = 3;
        System.out.println(max_winSize_sum(arr,win_size));*/

       /* int arr[] = {12,-1,-7,8,-15,30,16,28};
        int win_sz = 3;
        firstNegativeWin(arr,win_sz);*/

       /* String str = "foraaaaaorfssssssrofnuhuhuhkkffoorf";
        String ptr = "orf";
        System.out.println(occurencesOfAnagram(str,ptr));*/

    /*    int a[] = {1,3,-1,-3,5,3,6,7};
        int win_sz = 3;
       int[] d = returnThemaxNufromWindow1(a,win_sz);*/

      /* for(int i = 0 ; i < d.length ; i++)
           System.out.println(d[i]);

        int[] nums = {1,12,-5,-6,50,3};
        int k = 4;
        System.out.println(       max_avg(nums,k));*/

       /* String s = "aababcabc";
        int k = 3;
        System.out.println(numOfSubstringOfNonRepeatingcharacter(s,k));*/

      /* int n[] = {11,13,17,23,29,31,7,5,2,3};
       int k = 3;
       int threshold = 5;
        System.out.println(subarryGreaterThanthreshold(n,k,threshold));*/

        String answerKey = "TFFT";
        int k =1;
        System.out.println(maximiseConfusion(answerKey,k));


        
    }

    private static int maximiseConfusion(String answerKey, int k) {
        int i = 0;
        int j =0;
        int result = 0;
        int count_t = 0;
        int count_f = 0;
        int result_T = 0;
        int result_F = 0;
        String s = "";

        if(answerKey.length() < k || answerKey.length() == 0)
            return 0;
        while(j < answerKey.length()) {

            if (answerKey.charAt(j) == 'T') {
                count_t++;

            } else {
                count_f++;

            }
            if (j - i + 1 < k)
                j++;

            else if (j - i + 1 == k) {


                if (count_t >= count_f) {
                    if (answerKey.charAt(i) == 'F')
                        s=s+'T';
                    else
                        s= s+answerKey.charAt(i);
                } else if (count_t < count_f) {
                    if (answerKey.charAt(i) == 'T')
                        s = s + 'F';
                    else
                        s= s+answerKey.charAt(i);
                }


                i++;
                j++;

            } s= s+answerKey.charAt(answerKey.length()-1);
        }
            for(int m = 0 ; m < s.length() ; m++){
                if(s.charAt(m) == 'T')
                    result_T++;
                else
                    result_F++;
            }if(result_F > result_T)
                result= result_F;
            else
                result= result_T;
         return result;
    }

    private static int subarryGreaterThanthreshold(int[] n, int k, int threshold) {
        int count = 0;
        int i = 0;
        int j = 0;
        int sum = 0;
        int th = threshold*k;

        while(j < n.length){
            sum = sum+n[j];

            if(j-i+1 <k)
                j++;
            else if(j-i+1 ==k){
                if(sum >= th)
                    count++;
                sum = sum - n[i];
                i++;
                j++;
            }

        }return count;
    }


    private static int numOfSubstringOfNonRepeatingcharacter(String s, int wn_sz) {

        if (s.length() < wn_sz)
            return 0;

        int i = 0;
        int j = 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();


        while (j<s.length()) {

            Integer count = map.get(s.charAt(j));
            if(count == null)
                map.put(s.charAt(j), 1);
            else
                map.put(s.charAt(j),++count);
            int mp_size = map.size();

            if (j - i + 1 < wn_sz)
                j++;

            else if (j - i + 1 == wn_sz) {
               if(map.size() == wn_sz) {
                   result++;
               }
                   map.put(s.charAt(i),map.get(s.charAt(i))-1);
                   if(map.get(s.charAt(i))==0)
                       map.remove(s.charAt(i));

                i++;
                j++;


            }
        } return result;
    }

    private static double max_avg(int[] nums, int k) {
        int i = 0;
        int j = 0;
        double sum = 0;
        double max_sum = Integer.MIN_VALUE;

        while(j < nums.length){
            sum = (sum + nums[j]);

            if(j-i+1 <k)
                j++;
            else if(j - i +1 ==k){

                max_sum = Math.max(max_sum,sum);
                sum =  sum-nums[i];
                i++;
                j++;
            }

        }return max_sum/k;
    }

    private static int[] returnThemaxNufromWindow1(int[] a, int win_sz) {
        int res_arr1[] = new int[1];
        int m= 0;
        while(a.length < win_sz && m<a.length-1)
        {
            res_arr1[0] =  max(a[m],a[m+1]);
            return res_arr1;
        }
        int[] b = new int[a.length  - win_sz +1];
        Deque<Integer> dq = new LinkedList<>();

        int i = 0;
        int j = 0;
        while (j < a.length){

                while(!dq.isEmpty() && dq.peekLast() < a[j])
                    dq.removeLast();
                dq.add(a[j]);

            if(j-i+1 < win_sz)
                j++;
            else if(j - i +1 == win_sz){
                b[i] = dq.peekFirst();
                if(dq.peekFirst() == a[i]){
                    dq.removeFirst();
                }
                i++;
                j++;
            }
        } return b;
    }

    private static int[] returnThemaxNufromWindow(int[] a, int win_sz) {
        int res_arr1[] = new int[1];
        int m= 0;
        while(a.length < win_sz && m<a.length-1)
        {
            res_arr1[0] =  max(a[m],a[m+1]);
            return res_arr1;
        }
        int res_arr[] = new int[a.length - win_sz +1];
        Deque<Integer> de = new LinkedList<>();
        int i = 0;
        int j = 0;

        while(j < a.length){
            if(de.isEmpty())
                de.add(a[j]);
            else{
            while(!de.isEmpty() && de.peekLast() < a[j]) {
                de.removeLast();
            }de.add(a[j]);
            }
            if(j-i+1 < win_sz)
                j++;
            else if(j -i +1 ==win_sz){
               res_arr[i]= de.peek();
               if(de.peek() == a[i]){
                   de.removeFirst();
               }
                i++;
                j++;
            }

        }
        return res_arr;
    }

  /*  private static int occurencesOfAnagram(String str, String ptr) {
        if(str.length() < ptr.length())
            return 0;

        Map<Character,Integer> map = new HashMap<>();
        char[] ch = ptr.toCharArray();
        for(Character c : ch){
            Integer count = map.get(c);
            if(count == null)
                map.put(c,1);
            else
                map.put(c,++count);
        }

        int i = 0;
        int j = 0;
        int result = 0;
        int char_count = map.size();
        int k = ptr.length();

        while(j < str.length()){
           char curr_char = str.charAt(j);
            if(map.containsKey(curr_char)){
                map.put(curr_char,map.get(curr_char)-1);
                if(map.get(curr_char) ==0)
                    char_count --;
            }
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k){
                if(char_count == 0)
                    result++;
                char first_char = str.charAt(i);
                if(map.containsKey(first_char)){
                    map.put(first_char,map.get(first_char)+1);
                    if(map.get(first_char)==1)
                        char_count++;
                }i++;
                j++;
            }
        }return result;
    }*/

    private static void firstNegativeWin(int[] arr, int k) {
        if(arr.length < k)
            return;
        int i = 0;
        int j = 0;
        Queue<Integer> qu = new LinkedList<>();
        while (j < arr.length){
            if(arr[j] < 0)
                qu.add(arr[j]);
            if(j-i+1 < k)
                j++;
            else if(j-i+1 == k){
                if(qu.isEmpty())
                    System.out.println("0"+" ");
                else{
                    System.out.println(qu.peek()+" ");
                    if(arr[i] == qu.peek())
                        qu.remove();
                }i++;
                j++;
            }
        }

    }

    private static int max_winSize_sum(int[] arr, int k) {

        if(arr.length < k )
            return 0;

        int sum = 0;
        int curr_sum = 0;
        int j = 0;
        int i = 0;
       while(j < arr.length){
           curr_sum = curr_sum + arr[j];
           if(j-i+1 < k)
               j++;

           else if(j - i + 1 == k){
               sum = max(sum,curr_sum);
               curr_sum = curr_sum - arr[i];
               j++;
               i++;
           }
       } return sum;
    }
}
