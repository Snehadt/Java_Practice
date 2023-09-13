package src.slidingWindow;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class VariableSize {
    public static void main(String[] args) {
      /*  int[] a = {4,1,1,1,2,3,5};
        int sum = 5;
        System.out.println( findMaxWindowofSum(a,sum));*/
       /* String a = "aabacbebebe";
        int k =3;
        System.out.println(logestSubstringOfKuniqueChar(a,k));*/

        /*String s = "pwwkew";
        System.out.println(longestSubstringofallUniqueChar(s));*/

       /* String s = "abaccab";
        int win_sz = 2;
        System.out.println( pickToys(s,win_sz));*/

       /* String s = "timetopractice";
        String t = "toc";*/
       /* String s = "TOTMTAPTAT";
        String t = "TAT";*/

       /* String s = "geeksforgeeks";
        String t = "ork";
       // System.out.println(minLengthSubstring(s,t));
        System.out.println(minLengthSubstring1(s,t));*/

        //
   /* int nums[] = {3,2,5,4};
    int threshold = 5;*/

        int nums[] = {1,3};
        int threshold = 16;

     /*   int nums[] = {1,2};
        int threshold = 2;*/

      /*  int nums[] = {2,3,4,5};
        int threshold = 4;*/

        System.out.println(longestEvenoddSubarray(nums,threshold));
    }

    private static int longestEvenoddSubarray(int[] nums, int threshold) {


        if(nums.length == 0 )
            return 0;

        else if(nums.length == 1 && nums[0]%2 == 0)
            return 1;
        else if(nums.length == 1 && nums[0]%2 != 0)
            return 0;

        int r = 0;
        int i = 0;
        int l = 0;

        for( i = 0 ; i < nums.length ; i++){
            if(nums[i] % 2 == 0 && nums[i] <= threshold)
            {
                l = i;
                break;
            }
        }

        if(l == 0)
            return 0;
        int j = 0;
        for(j = i ; j < nums.length -1 ; j++){
            if(nums[j] % 2 != nums[j + 1] % 2 && nums[j] <= threshold && nums[j+1] <= threshold)
               continue;
            else
                break;
        } r = j;

        return r - l +1;


    }


    private static int minLengthSubstring1(String s, String t) {
        Map<Character,Integer> map = new HashMap<>();

        char[] t_arr = t.toCharArray();
        for(Character c : t_arr) {
            Integer count = map.get(c);
            if(count == null)
                map.put(c,1);
            else
                map.put(c,++count);
        }

        int i = 0;
        int j = 0;
        int mp_sz = map.size();
        int k = t.length();
        int min_win = Integer.MAX_VALUE;
int min = 0;
        while(j < s.length()){
            char endChar = s.charAt(j++);
            if(map.containsKey(endChar)){
                map.put(endChar,map.get(endChar)-1);
                if(map.get(endChar)==0){
                    mp_sz--;
                }
                if(mp_sz > 0)
                    continue;
                while(mp_sz == 0){
                    char startChar = s.charAt(i++);
                    if(map.containsKey(startChar)){
                        map.put(startChar,map.get(startChar)+1);
                        mp_sz++;
                    }
                }

              //  min_win = min(min_win,j-i);
                min = s.length();
                if((j-i) < min){
                    min = j-i;
                }
            }
        } return min;

    }

   /*  private static int minLengthSubstring(String s, String t) {

       Map<Character,Integer> map = new HashMap<>();

        char[] t_arr = t.toCharArray();
        for(Character c : t_arr) {
            Integer count = map.get(c);
            if(count == null)
                map.put(c,1);
            else
                map.put(c,++count);
        }

        int i = 0;
        int j = 0;
        int mp_sz = map.size();
        int k = t.length();
        int min_win = Integer.MAX_VALUE;

        while(j < s.length()){
            char s_char = s.charAt(j);
            if(map.containsKey(s_char)){
                map.put(s_char,map.get(s_char)-1);
                if(map.get(s_char) ==0)
                    mp_sz--;
            }

            if(mp_sz >0)
                j++;
            else if(mp_sz == 0){
                while(mp_sz ==0) {
                    if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) < 0) {
                        while (map.get(s.charAt(i)) < 0) {
                            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                        }
                        i++;

                    } else if (!map.containsKey(s.charAt(i))) {
                        i++;
                    } else if (map.containsKey(s.charAt(i)) && map.get(s.charAt(i)) == 0) {
                        map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
                        mp_sz++;

                    }
                }
                min_win = Math.min(min_win,j-i+1);
                i++;

                j++;

            }

        }
    }return min_win;*/

    /*private static int pickToys(String s, int k) {

        if(s.length() < k)
            return s.length();
        int i = 0;
        int j = 0;
        int max_toy = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap<>();

        while(j < s.length()){

            Integer count = map.get(s.charAt(j));
            if(count == null)
                map.put(s.charAt(j),1);
            else
                map.put(s.charAt(j),++count);

            if(map.size() < k)
                j++;
            else if(map.size() == k){
                max_toy = max(max_toy,j-i+1);
                j++;

            }else if(map.size() > k){
                while(map.size() > k){
                    map.put(s.charAt(i),map.get(s.charAt(i))-1);
                    if(map.get(s.charAt(i))==0)
                        map.remove(s.charAt(i));
                    i++;
                }j++;
            }

        }return max_toy;
    }*/

  /*  private static int longestSubstringofallUniqueChar(String s) {

        Map<Character,Integer> map = new HashMap<>();

        int i = 0;
        int j = 0;
        int max_win = Integer.MIN_VALUE;

        while(j < s.length()){
           Integer count = map.get(s.charAt(j));
           if(count == null)
               map.put(s.charAt(j),1);
           else
               map.put(s.charAt(j),++count);

           if(map.size() > j-i+1)
               j++;
           else if(map.size() == j-i+1){
               max_win = max(max_win,j-i+1);
               j++;
           }
           else if(map.size() < j-i+1){
               while(map.size() < j-i+1){
                   map.put(s.charAt(i),map.get(s.charAt(i))-1);
                   if(map.get(s.charAt(i))==0)
                   map.remove(s.charAt(i));
                   i++;
               }j++;
           }
        }return max_win;
    }*/

  /*  private static int logestSubstringOfKuniqueChar(String a, int k) {
        int i = 0;
        int j = 0;
        Map<Character,Integer> map= new HashMap<>();
        int max_sz = Integer.MIN_VALUE;
        while(j < a.length()){
            Integer count =map.get(a.charAt(j));
            if(count == null)
                map.put(a.charAt(j),1);
            else{
                map.put(a.charAt(j),++count);
            }
            if(map.size() < k)
                j++;
            else if(map.size() == k){
                max_sz = max(max_sz,j-i+1);
                j++;

            }else if(map.size() > k){
                while(map.size() > k){
                    map.put(a.charAt(i),map.get(a.charAt(i))-1);
                    if(map.get(a.charAt(i)) == 0)
                        map.remove(a.charAt(i));
                       i++;
                }j++;
            }
        }return max_sz;
    }*/

   /* private static int findMaxWindowofSum(int[] a, int sum) {
        int i = 0;
        int j = 0;
        int curr_sum = 0;
        int counter = 0;
        while(j < a.length){

            curr_sum = curr_sum+a[j];
            if(curr_sum < sum){
                j++;
            }

            else if(curr_sum == sum) {
                counter = max(counter, j-i+1);
                curr_sum = curr_sum - a[i];
                i++;
                j++;
            }else if(curr_sum > sum ){
                while(curr_sum > sum) {

                    curr_sum = curr_sum - a[i];


                    i++;
                }j++;
            }
        }return counter;
    }*/
}
