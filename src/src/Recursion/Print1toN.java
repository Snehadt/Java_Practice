package src.Recursion;

import java.util.*;

public class Print1toN {
    public static void main(String[] args) {
       int n = 5;
       //print1toN(n);

      // printNto1(n);

        String s = " SNeha I am";
     //   System.out.println(reverseString(s));

        String arr[] = {"geeksforgeeks", "geeks", "geek","geezer"};
        int num = 4;
       // longestCommonPrefix(arr,num);

        String s1 = "wurkbxkgkfmlzofn";
        String s2 = "mczujslxzvhecrpy";
        int k = 10;

       // System.out.println(isAnagramAtk(s1,s2,k));

        int a[] = {3,6,1,7,2,9,0};
      //  thirdLargest(a);

        String k2 = "hello my name";
        int len = k2.length();
       // System.out.println(reverseString1(k2,len));

        String q = "my name is Sneha Sneha is name my ";
        int sz =q.length();
        System.out.println(isPallindrome(q));
        String p1 = "listen";
        String p2 = "silent";
      //  isAnagram(p1,p2);

        String q1= "pwwkew";
      //  System.out.println(longestNonRepeatingsubsequence(q1));

        String x = "aabcccccaaad";
        // System.out.println(compressString(x));
        compressString(x);

        String a1 = "waterbottle";
        String a2 = "erbottlewat";
      //  System.out.println(checkifRotation(a1,a2));

        String z = "abc";
        String ans ="";
        permutationOfAllString(z,ans);
    }

    private static void permutationOfAllString(String z,String ans) {
        if(z.length() ==0)
            System.out.println(ans);

        for(int i = 0 ; i < z.length() ; i++){
            String rem=z.substring(0,i)+z.substring(i+1);
            permutationOfAllString(rem,ans+z.charAt(i));

        }
    }

    private static boolean checkifRotation(String a1, String a2) {
        String s = a1+a1;
        if(s.contains(a2))
            return true;
        return false;
    }

    private static void compressString(String x) {
      /*  String s = "";
        int count = 1;
        for(int i = 0 ; i < x.length() ;i++){
            if(i+1<x.length() && x.charAt(i)==x.charAt(i+1))
            {
                count++;
            }
            else{
                s+= x.charAt(i);
                s+= count;
                count=1;

            }
        }

        return s.length() < x.length() ? s :x;*/


    }

    private static int longestNonRepeatingsubsequence(String q1) {
/*        Map<Character,Integer> map = new HashMap<>();
        char[] c = q1.toCharArray();
        int count = 0;
        int finalCOunt = Integer.MIN_VALUE;
        for(int i = 0 ; i < c.length ; i++){
            Integer s = map.get(c[i]);
            if(s == null) {
                map.put(c[i],1);
                count++;

            }else{
                map.put(c[i],++s);
                count = 1;
            }finalCOunt = Math.max(finalCOunt,count);
        } return finalCOunt;*/

        Map<Character,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int currENd = 0;
        int currStart = 0;
        int finalCount = Integer.MIN_VALUE;
        char[] ch = q1.toCharArray();
        while(j < ch.length) {
            map.put(ch[j], map.getOrDefault(ch[j], 0) + 1);
            int currLen = j - i + 1;
            if (map.size() == j-i+1) {
                if (finalCount < j-i+1) {
                    finalCount = j-i+1;
                    currENd = j;
                    currStart = i;

                }j++;


            } else if (map.size() < j - i + 1) {
                while (map.size() < j - i + 1) {
                    map.put(ch[i], map.get(ch[i]) - 1);
                    if (map.get(ch[i]) == 0)
                        map.remove(ch[i]);
                    i++;
                }
                j++;
            }
        }
        System.out.println(q1.substring(currStart, currENd + 1));
        return finalCount;
    }

    private static boolean isAnagram(String p1, String p2) {
        if(p1.length() != p2.length())
            return false;
        int n[] = new int[256];
        for(int i = 0 ; i < p1.length() ; i++){
            n[p1.charAt(i)]++;
            n[p2.charAt(i)]--;
        }for(int x : n)
        {
            if(x != 0)
                return false;
        }
        return true;


    }

    private static boolean isPallindrome(String q) {
        q.replaceAll("\\s+","").toLowerCase();
        if(q.charAt(0) == q.charAt(q.length()-1))
        return isPallindrome(q.substring(1,q.length()-1));
        return false;
      /*  String s[] = q.split(" ");

        int i = 0;
        int j = s.length-1;

        while(i <j){
            if(!s[i].equals(s[j]))
                return false;
            i++;
            j--;
        } return true;*/
       /* int j = q.length()-1;
        int i = 0;
        while(i < j){
            if(q.charAt(i) != q.charAt(j)){
                return false;
            }i++;
            j--;
        }return true;*/
    }

    private static String reverseString1(String s1,int len) {
  if(len == 1)
      return String.valueOf(s1.charAt(0));
        return s1.charAt(len-1)+reverseString1(s1,len-1);
       /* String[] s = s1.split(" ");
        String str = "";
        for(int i = 0 ; i < s.length ; i++){
           str = s[i]+" "+str;
        }
        System.out.println(str);*/
    }

    private static void thirdLargest(int[] a) {
        int largest = Integer.MIN_VALUE;
        int sec_largest = Integer.MIN_VALUE;
        int third_largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < a.length ; i++){
            if(largest < a[i]) {
                third_largest=sec_largest;
                sec_largest = largest;
                largest=a[i];

            }
            else if(a[i] > sec_largest)
            {
                third_largest=sec_largest;
                sec_largest=a[i];
            }
            else if(a[i] >third_largest)
                third_largest =a[i];/*
            if(a[i]>third_largest  && sec_largest != a[i])
                third_largest=a[i];*/

        }
        System.out.println(sec_largest);
    }

    private static boolean isAnagramAtk(String s1, String s2, int k) {

        int x = 0;
        if(s1.length() != s2.length())
            return false;
        char[] c1 =s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i = 0 ; i < c1.length ; i++){
            if(c1[i] != c2[i]){
                x++;
            }
            if(x > k)
                return false;
        } return true;
    }

    private static void longestCommonPrefix(String[] arr, int num) {
        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ;i++){
            min =Math.min(arr[i].length(),min);
        }
        int j = min;
        int i = 0;
        int x = Integer.MAX_VALUE;
      //  System.out.println(arr[0].substring(0,3));
            while((j >= 0) && (i <arr.length-1)){
                if(!(arr[i].substring(0,j)).equals (arr[i+1].substring(0,j))){
                    i++;
                    continue;
                }else{
                    i++;
                    x = Math.min(x,j);
                }
                if(i==arr.length){
                    i=0;
                    j--;
                }

        }System.out.println(arr[i].substring(0,x));
    }

    private static String reverseString(String s) {

        List arr = new ArrayList<>();
        String ans = "";
       String[] st = s.split(" ");

       for(int i = st.length -1 ; i >=0 ; i--){
           ans = ans+" "+st[i];
       }
       return ans;
    }

    private static void printNto1(int n) {
        if(n==0)
            return;
        System.out.println(n);
        printNto1(n-1);

    }


    private static void print1toN(int n) {
    if(n==0)
        return;
    print1toN(n-1);
        System.out.println(n);

    }
}
