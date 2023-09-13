package src;

import java.util.*;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class testing {
    public void main(String[] args) {
        // testing1();
       /* String s = "ABCDCBA";
        pallindrome(s);*/

/*        String s1 = "ABCD";
        String s2 = "AD";

        System.out.println(subsequence(s1,s2));*/

      /*  String s1 = "listen";
        String s2 = "silent";
        checkAnagram(s1,s2);*/
       /* String s = "abbcc";
        System.out.println(leftmostrepeatingchar(s));*/
/*
        String s = "geekforgeeks";
        System.out.println(leftmostNonRepeatingChar(s));;*/

       /* //String s = "sneha";
        String s = "wl too geek";
        System.out.println(reverseString(s));*/

/*        String s = "ABABABCD";
        String pattern = "ABAB";
        
        patternSearch1(s,pattern);*/

       /* String s = "abcdabc";
        System.out.println(longestSubstring(s));*/

/*        String s = "100";
        System.out.println(isBinaryDiv(s));;*/

      /*  int arr[] = {2,3,5,6,8,10};
        int sum = 10;
        subsetSum(arr,sum);*/

       /* String s = "racecars";
        System.out.println(pallidrome(s));*/
      /*  String s = "Hello World btw";
        reverseStringFunc(s);*/

      /*  String s = "listen";
        String s1 = "silent";
        System.out.println(isAnagram(s,s1));*/

/*        String s = "abracadabra";
        System.out.println(firstNonRepeatingchar(s));*/

       /* String s = "babad";
        longestPallindromesubs(s);*/

     /*  String s = "I have a cat . The cat is cute. I love my cat .";
       numOfOccurence(s);*/

      /*  String s = "abcabcbbcad";
        System.out.println(longestNonRepeatingSubs(s));*/

      /*  String s = "ADOBECODEBANC";
        String target = "ABC";
        minWindowContainingcharacter(s,target);*/

      /*  String s1 = "hello";
        String s2 = "world";

        System.out.println(isRotation(s1,s2));*/

      /*  String s = "abcde f ";
        stringfunc(s);*/

     /*  // int a[] = {5,10,20,15,7};
        int a[] = {10,20,15,5,23,90,60};
        System.out.println(peakEle(a));;*/
        
       /* int a[][] ={{1,3,2} ,{4,6,4},{5,6,7}};
        sumOfDiagonal(a);*/

        /*int a[] = {1,2,2,3,4,5};
        //System.out.println(removeDuplicate(a));
        removeDuplicates(a);*/

    }

        int binarySearch(int[] a,int low,int high,int val){
            int n=a.length;
            int res = -1;
            while(low<=high){
                int mid = low + (high-low)/2;
                if(a[mid]<=val){low=mid+1;}
                else{
                    res=mid;
                    high=mid-1;
                }
            }
            if(res==-1){return n;}
            return res;
        }
        public int removeDuplicates(int[] arr) {
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

    private static int removeDuplicate(int[] a) {

     /*   int start = 0;
        int end = a.length;

        while(start <=end){
            int mid = start+(end-start)/2;

            if(a[mid]==a[mid-1]);
        }*/

        Set<Integer> set = new HashSet<>();

        for(int i = 0 ; i < a.length ; i++) {
            set.add(a[i]);
        }

        return set.size();


    }

    private static void sumOfDiagonal(int[][] a) {
        int s1 = 0;
        for(int i = 0 ; i <a.length ; i++){
            for(int j = 0 ; j <a[i].length;j++){
                if(a[i] ==a[j])
                    s1 += a[i][j];
            }

        }System.out.println(s1);
        int s2 = 0;
        for(int i = 0 ; i <a.length ; i++){
            for(int j = a[i].length-1; j >=i;j--){
                        s2 += a[i][j];
            }
        }
        System.out.println(s2);
    }

    private static int peakEle(int[] a) {

        int start = 0;
        int end = a.length -1;

        if(a.length ==1)
            return a[0];
        if(a.length == 0)
            return 0;
        while (start <= end){
            int mid = start+(end-start)/2;

            if((mid == 0 || a[mid-1] < a[mid] )&& (mid == a.length -1 || a[mid+1] < a[mid] ))
                System.out.println(a[mid]);
            else if(a[mid] > a[mid -1])
                start = mid + 1;
            else
                end = mid -1 ;
        }
        return -1;
    }

    private static void stringfunc(String s) {

       String s1= s.trim();

      s1=  s.toUpperCase(Locale.ROOT);
        System.out.println(s1);
    }

    private static boolean isRotation(String s1, String s2) {

        String s = s1+s1;

        if(s.contains(s2))
            return true;
        else
            return false;
    }

    private static void minWindowContainingcharacter(String s, String target) {

      /*  String tar = "";
        int max_l = Integer.MAX_VALUE;
        if(s.length()==1)
            System.out.println("1");

        for(char c : s.toCharArray()){
           String character =  String.valueOf(c);

           if(target.contains(character))
              tar = tar+character;
           target.substring(target.indexOf(character)+1);

          max_l = min(tar.length(),max_l);*/

        int max_ln = Integer.MAX_VALUE;
        for(int i = 0 ; i < s.length() ; i++){
            String tar = "";
            if(s.substring(i).contains(target)){
                tar = s.substring(i);
            }
            max_ln = Math.min(max_ln,tar.length());

        }
    }

    private static int longestNonRepeatingSubs(String s) {
      /*  String test = "";
        int max_ln = -1;
        if(s.length() ==1)
            return 1;
        if(s.isEmpty())
            return 0;

       for(char c : s.toCharArray()){
           String character = String.valueOf(c);

           if(test.contains(character))
             test =  test.substring(test.indexOf(character)+1);
           test =test+character;
         max_ln =  max(test.length(),max_ln);
       }return max_ln;
*//*
 String test = "";
        int max_ln = -1;
        if(s.length() ==1)
            return 1;
        if(s.isEmpty())
            return 0;

       for(char c : s.toCharArray()){
           String character = String.valueOf(c);

           if(test.contains(character))
             test =  test.substring(test.indexOf(character)+1);
           test =test+character;
         max_ln =  max(test.length(),max_ln);
       }return max_ln;
*/


        int max_ln = 0;
        String res = "";
        if(s.isEmpty())
            return 0;
        if(s.length() ==1)
            return 1;

        for(char c : s.toCharArray()){

            String character = String.valueOf(c);
            if(res.contains(character))
                res =res.substring(res.indexOf(character)+1);
            res = res + character;
            max_ln = max(res.length(),max_ln);

        } return max_ln;
    }

    private static void numOfOccurence(String s) {

        Map<String , Integer> map = new HashMap<>();
        String s1[] = s.split(" ");
         for(String s2:s1){
           Integer count =  map.get(s2);
           if(count == null)
               map.put(s2,1);
           else
               map.put(s2,++count);
         }
        Integer count1 =Collections.max(map.values());
        Set<Map.Entry<String,Integer>> set = map.entrySet();
         for(Map.Entry<String,Integer> it : set){
          if(it.getValue() == count1)
              System.out.println(it.getKey()+" "+it.getValue());


         }
    }

    private static int longestPallindromesubs(String s) {
        int j = s.length()-1;
        for(int i = 0 ; i < s.length()  ; ){
            if(s.charAt(i) == s.charAt(j-i))
                return (j-i-i+1);
            else{
                j--;
            }
        }
        return j;
    }

    private static char firstNonRepeatingchar(String s) {
        int CHAR = 256;
        int count[] = new int[CHAR];

        for(int i = 0 ; i < s.length() ; i++)
            count[s.charAt((i))]++;
            for(int i = 0 ; i<count.length ; i++)
            if(count[i] == 1)
                return s.charAt(i);
            else
                return 0;
        return 0;
    }

    private static boolean isAnagram(String s, String s1) {


        int CHAR = 256;
        boolean[] charr = new boolean[CHAR];



        for(int i = 0 ; i < s.length() ; i++){

            if(s.length() != s1.length())
                return false;
           int c = s.charAt(i);
           charr[c] = true;
        }for(int i = 0 ; i < s1.length() ; i++){
            if(charr[s1.charAt(i)] == true)
                return true;
            else
                return false;
        }return false;



    }

    private static void reverseStringFunc(String s) {
      /*  String s1 = "";
        for(int i = s.length() -1; i >= 0 ; i--){
           // System.out.println("hi");
            s1 = s1+s.charAt(i);
        }
        System.out.println(s1);*/

        char[] c = s.toCharArray();
String g ="";
       String s1[] = s.split(" ");

       for(int i = s1.length -1 ; i >=0 ;i--){
           if(i == s1.length -1)
          g =g+s1[i];
           else
               g=g+" "+s1[i];
       }

        System.out.println(g);
    }

    private static boolean pallidrome(String s) {

        int j = s.length();
        for(int i = 0 ; i < s.length() ; i++){
                if(s.charAt(i) == s.charAt((s.length() -1)-i)){
                    return true;
                }else
                    return false;
        }
        return false;
    }

    private static void subsetSum(int[] arr, int sum) {

        int s1 = 0;
        int diff = 0;
        for(int i = 0 ; i < arr.length-1 ; i++){
          s1 += arr[i]+arr[i+1];

          if(s1 < sum){
            diff =  sum - s1;

            subSet1(arr,diff,i+2);
          }
        }

    }

    private static void subSet1(int[] arr, int diff,int start) {
        for(int i = start ; i < arr.length ; i++){
            int diff1 = diff -start;
            if(arr[start] == diff){
              //  return arr[start];
            }else if(arr[start] < arr[i]){
                subSet1(arr,diff-arr[start],start+1);

            }else if(arr[start] > diff)
                break;
        }
    }

    private static int isBinaryDiv(String s) {
        int res = 0;
        for(int i = 0 ;i < s.length() ; i++){
            int num = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(num == 1)
                res += Math.pow(2,((s.length()-1)-i));

        }if(res%3 ==0)
            return 1;
        else
            return 0;

    }

    private static int longestSubstring(String s) {
        int cur_count = 0;
        int count = 0;
        for(int i = 0 ; i < s.length()-1 ; i++){

             if(s.charAt(i) != s.charAt(i+1)){
                 count++;
                 cur_count = count;

             }else
                 count = 0;
             cur_count = max(count,cur_count);

        } return cur_count;
    }

    private static void patternSearch1(String s, String pattern) {
        int j = 0;
        for(int i = 0 ; i < s.length() ; ){
            if(s.charAt(i)==pattern.charAt(j)){
                j++;
            }
        }
    }

    private static String reverseString(String s) {
      /*  String s1 = "";
        for(int i = s.length() -1 ; i >= 0 ; i--){
               s1= s1+ s.charAt(i);
        }
        System.out.println(s1);*/

       String[] s1 = s.split(" ");
       String s2 = "";
       for(int i = 0 ; i < s1.length ; i++){

                  s2 = " "+s1[i]+s2;
       } return s2;
    }

    private static int leftmostNonRepeatingChar(String s) {

        int CHAR = 256;
        int res = 0;
        boolean c[] = new boolean[CHAR];
        for(int i = s.length() -1; i >= 0 ; i--){
            if(!c[s.charAt(i)])
                c[s.charAt(i)] = true;
            else
                res = i;
        } for(int i = 0 ; i < s.length() ; i++){
            if(c[s.charAt(i)] == true)
                return i;
        }return -1;
    }

    private static int leftmostrepeatingchar(String s) {
       /* for(int i = 0 ; i < s.length() ; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j))
                    return i;
            }
        }
        return -1;*/

      final  int CHAR = 256;
int res = 0;
      boolean c[] = new boolean[CHAR];
        for(int i = s.length() -1 ; i >= 0 ; i--){
            if(c[s.charAt(i)])
                res = i;
            else
                c[s.charAt(i)] = true;
        }return res;

    }

    private static boolean checkAnagram(String s1, String s2) {

        final int CHAR = 256;
        int count[] = new int[CHAR];
        for(int i = 0 ; i < s1.length() ; i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for(int i = 0 ; i < count.length ; i++){
            if(count[i] != 0)
                return false;
        }return true;
    }

    private static boolean subsequence(String s1, String s2) {
        int j = 0;
    for(int i = 0 ; i < s1.length() && j < s2.length(); i++){
        if(s1.charAt(i)==s2.charAt(j))
            j++;
    }
        return(j == s2.length());
    }

    private static void pallindrome(String s) {

      int c1 = 0;
      int c2 = s.length() -1;

      while(c1 <= c2){
          if(s.charAt(c1) == s.charAt(c2)){
              System.out.println("pallindrome");
              c1++;
              c2--;
          }else{
              System.out.println("not a pallindrome");
              c1++;
              c2--;
          }
      }

    }

    private static void testing1() {
        int i = 10;
        for( i = 0 ; i < 5 ; i++)
            System.out.println("inner"+i);
        System.out.println("outer"+i);
    }
}
