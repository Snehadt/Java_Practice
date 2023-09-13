package src.Recursion;

import java.util.*;
import java.util.stream.Collectors;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class test {


    public static void main(String[] args) {
    /*    int i = 1;
       // rec(10,i);
        int s=0;*/
       // System.out.println(sumOf(10));
      //  sumOfDigit(183);
       // int[] n = {3,2,1,7,5,3,9,5,10,11,6};
       // largestVal(n);

       // removeduplicates(n);
     //   int n[] = {3,4,1,0,6,3,0,7,9,10};
      //  moveZerotoEnd(n);
      //  maxDiff(n);
      /*  int n[] = {10,10,10,20,20,30,40};
        frequencyARray(n);*/

      /*  int n[] = {5,0,6,2,3};
        trappingRainWater(n);*/

      /*  int n[] = {0,1,1,1,1,0,1,1,1,0};
        maxConsecutive1(n);*/

        /*int n[] = {2,3,-8,7,-1,2,3};
        maxsubArraySum(n);*/

      /*  int n[] = {10,12,14,7,8,6,5,4,3,2,1};
        maxLengthEvenOdd(n);*/

     /*   int n[] = {5,-2,3,4};
        System.out.println(maxcircularsubarray(n));*/

       /* int n[] = {8,3,4,8,8};
        majorityEle(n);*/
      /*
        int n[] = {1,1,0,0,0,1};
        minCOnseFlip(n);*/

     /*   int n[] = {5,2,-1,0,3};
        int k = 3;
        System.out.println(slidingwindow(n,k));*/

     /*   int n[] = {12,-1,-7,-8,-15,30,16,28};
        int k = 3;
        firstNegativeNum(n,k);*/

       /* int n[] = {1,4,20,3,10,5};
        int sum = 33;
        subArraySum(n,sum);*/

/*        int n[] = {2,8,3,9,6,5,4};
        int start = 0;
        int end = 2;
        prefixSum(start,end,n);*/

     /*   int n[] = {4,2,-2};
        equilibriumPoint(n);*/

      /*  int n[] = {100, 180, 260, 310, 40, 535, 695};
        stockbuySell(n);*/

     /*   int n[] = {10,20,30,40,50,60,60,70};
        int num = 60;
        int start = 0;
        int end = n.length-1;

       // System.out.println(firstIndexOccurence(n,num,start,end));;
        System.out.println(firstLastOccurence(n,num,start,end));*/

       /* int n[] = {5,10,20,15,7};
        peakEle(n);*/

    /*    int n[] = {2,5,1,8,2,9,1};
        int winSize = 3;
        System.out.println(maxSumArray(n,winSize));*/

       /* int n[] = {0,1,2,3,4,5,6,7,8,9,10,-1};
        int sum = 10;
        sumOfNums(n,sum);*/

      /*  int n[] = {2,3,4,8,9,20,40};
        int x = 32;
        sumOfTriplet(n,x);*/
/*        int a[] = {10,20,30,40,50};
        int b[]  = {5,15,25,35,45};
        medianOfSortedArr(a,b);*/

      /*  int n[] = {0,2,1,3,2,2};
        System.out.println(repeatinfEle(n));*/

      /*  int a[][] = {{1,2,3,4},
                     {5,6,7,8},
                     {9,10,11,12},
                     {13,14,15,16}};
      //  printSnakePattern(a);
        
        transposeMatrix(a);*/

        /*int n[] = {15,12,13,12,13,13,18};
        countDIstinctEle(n);*/

      /*  int n[] = {10,12,10,15,10,20,12,12};

        frequenciesArrayEle(n);*/


       /* String name = "Snehaa";
        frequesncyOfalphabet(name);*/

      /*  Integer a[] = {10,15,20,20,25,30,50};
        Integer b[] = {30,5,15,80};
        
        intersectionOfArrays(a,b);*/

    /*    Integer arr[] = {3,2,8,16,-8};
        int sum = 17;

        System.out.println(sumOfPair(arr,sum));;*/

   /*     int[] a = {1,4,13,-3,-10,5};
        int sum = 0;
        System.out.println(suarraywithSum(a,sum));;*/


       /* int n[] = {3,1,0,1,8,2,3,6};
        int sum = 5;*/
       /* int n[] = {8,3,7};
        int sum = 15;*/

/*        int n[] = {5,8,-4,-4,9,-2,2};
        int sum = 0;
      *//*  int[] n = {5,8,6,13,3,-1};
        int sum = 22;*//*
       // longestSubArray(n,sum);

        longestSubArray1(n,sum);*/

       // int n[] = {1,0,1,1,1,0,0};
      /*  int n[] = {1,1,1,1,0,0};
        longestEqualSubArray(n);*/

 /*       int n[] = {0,1,0,1,1,1,1};
        int m[] = {1,1,1,1,1,0,1};
        longestSubarraywithGivenSum(n,m);*/

       /* int n[] = {1,9,3,4,2,20};
        lengthOFlongestSubsequence(n);*/

   /*     int n[] = {10,20,20,20,30,40,10};
        int win_size = 4;
        distinctEleWin(n,win_size);*/


        int n[] = {30,10,20,20,20,10,40,30,30};
        int k = 4;
        occurencesMoreThan(n,k);


    }

    private static void occurencesMoreThan(int[] n, int k) {

       int size = n.length;

       Map<Integer,Integer> map = new HashMap<>();

       for(Integer i : n){
          Integer count = map.get(i);
          if(count == null)
              map.put(i,1);
          else
              map.put(i,++count);
       }

       Set<Map.Entry<Integer,Integer>> it =map.entrySet();

       for(Map.Entry<Integer,Integer> i : it){
           if(i.getValue() > size/k)
               System.out.println(i.getKey());
       }
    }

    private static void distinctEleWin(int[] n, int win_size) {

        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;

        while(j-i+1 < win_size && j < n.length){
            j++;

        }while(j-i+1 == win_size && j < n.length){
            int k = i ;
            while(k <= j){
            set.add(k);
            k++;
            }i++;
            j++;
        }
    }

    private static void lengthOFlongestSubsequence(int[] n) {

       /* Arrays.sort(n);
        int res = 0;
        int count = 0;
        for(int i = 0 ; i< n.length-1 ; i++){
                if(n[i+1] - n[i] ==1){
                    count++;
                }else if(n[i+1] != n[i]) {
                    res = max(res, count);
                    count = 0;
                }

            System.out.println(res);
        }*/

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n.length; i++) {
            set.add(n[i]);
        }
        Iterator<Integer> it = set.iterator();

        }


    private static void longestSubarraywithGivenSum(int[] n, int[] m) {
       /* int res = 0;
        for(int i =0 ; i < n.length ; i++){
            int firstArr = 0;
            int secArr = 0;
            for(int j = i; j < m.length ; j++){
                    firstArr += n[j];
                    secArr += m[j];

                    if(firstArr == secArr)
                    res =    max(res,j-i+1);
            }
        }
        System.out.println(res);*/

        for(int i = 0 ; i < n.length ; i++){
            if(n[i] == 0)
                n[i] = -1;
            if(m[i] == 0)
                m[i] = -1;
        }

        int res = 0;

        for(int i = 0 ; i < n.length ; i++){

        }
    }

    private static void longestEqualSubArray(int[] n) {

      /*  int pre_sum = 0;
        int pre_num = 0;
        int res = 0;
        for(int i = 0 ; i < n.length ; i++){
            pre_sum = 0;
             pre_num = 0;
            for(int j = i ; j < n.length ; j++){
                if(n[j] == 1)
                    pre_num++;
                else
                    pre_sum++;
                if(pre_num == pre_sum){
                    res = max(res,j-i+1);
                }
            }

        }System.out.println(res);*/

        for(int i = 0 ; i < n.length ; i++){
            if(n[i] == 0)
                n[i] = -1;
        }
        int pre_sum = 0;
        int res = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ; i < n.length ; i++){
            pre_sum += n[i];

            if(pre_sum == 0)
                res = i+1;
            else if(!m.containsKey(pre_sum))
                m.put(pre_sum, i);
            else if(m.containsKey(pre_sum))
              res =  max(res,i-m.get(pre_sum));
        }
        System.out.println(res);
    }

    private static void longestSubArray1(int[] n, int sum) {

   /*     int count = 0 ;
        for(int i = 0 ; i < n.length ; i++){
            int curr_sum = 0;
            for(int j = i ; j < n.length ; j++){
                curr_sum += n[j];
                if(curr_sum == sum){
                   count = max(count,j-i+1);

                }

            }
        }*/

     /*   int res = 0;
        int pre_sum = 0;
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0 ; i < n.length ; i++){
            pre_sum += n[i];
            if(pre_sum == sum)
                res = i+1;
            else if(!m.containsKey(pre_sum))
                m.put(pre_sum,i);
            else if(m.containsKey(pre_sum-sum)){
          //      System.out.println("hi"+m.get(pre_sum-sum));
              res =  max(res,i-m.get(pre_sum-sum));

            }
            System.out.println( res);
        }*/


        int pre_sum = 0, res = 0;
        Map<Integer,Integer> m = new HashMap<>();

        for(int i = 0 ; i < n.length ; i++){
            pre_sum += n[i];

            if(pre_sum == sum)
                res = i+1;
            else if(!m.containsKey(pre_sum))
                m.put(pre_sum,i);
            else if(m.containsKey(pre_sum - sum))
               res = max(res, i - m.get(pre_sum - sum));

            System.out.println(res);
        }
    }

    private static void longestSubArray(int[] n, int sum) {
    int pre_sum = 0;
    int count = 0;
    int pre_count = 0;
    Set<Integer> set = new HashSet<>();

    for(int i = 0 ; i < n.length ; i++){
        pre_sum += n[i];
        pre_count++;
        if(pre_sum == sum) {
          count =  max(count,pre_count);
            System.out.println(count);
            pre_count = 0;
            pre_sum = 0;
        }
        else if(set.contains(pre_sum - sum)) {
            count = max(count, pre_count);
            System.out.println(count);
            pre_count = 0;
            pre_sum = 0;
        }
        else
        set.add(pre_sum);
    }
    }

    private static boolean suarraywithSum(int[] a, int sum) {
      Set<Integer> set = new HashSet<>();
      int count = 0;
      for(int i = 0 ; i < a.length ; i++){
          count += a[i];

          if(count == 0){
              return true;
          } if(set.contains(a[i]))
              return true;
          set.add(count);
      } return false;
    }

    private static boolean sumOfPair(Integer[] arr, int sum) {

        Set<Integer> set = new HashSet<>();

        for(Integer i : arr){
            if(set.contains(sum - i))
                return true;
            else
                set.add(i);
        } return false;
    }

    private static void intersectionOfArrays(Integer[] a, Integer[] b) {
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i : a){
           Integer count = map.get(i);
           if(count == null)
            map.put(i,1);
           else
               map.put(i,++count);
        }
        for(Integer i : b){
            Integer count = map.get(i);
            if(count == null)
                map.put(i,1);
            else
                map.put(i,++count);
        }

      Set<Map.Entry<Integer,Integer>> set1 =  map.entrySet();


      for(Map.Entry<Integer,Integer> s : set1){
         // System.out.println(s.getKey()+"  "+s.getValue());
          if(s.getValue() > 1 && Arrays.stream(b).anyMatch(sc -> sc.equals(s.getKey())) )
              System.out.println(" The number "+s.getKey());

      }
    }

    private static void frequesncyOfalphabet(String name) {

        char c[] = name.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        for(Character ch : c){
           Integer count = map.get(ch);

           if(count == null)
               map.put(ch,1);
           else
               map.put(ch,++count);
        }

       Set<Map.Entry<Character,Integer>> set = map.entrySet();
        for(Map.Entry<Character,Integer> s : set){
            System.out.println(s.getKey()+"  "+s.getValue());

            if(s.getValue() >1)
                System.out.println(s.getKey());
        }
    }

    private static void frequenciesArrayEle(int[] n) {

        List<Integer> arr = Arrays.stream(n).mapToObj(Integer::valueOf).collect(Collectors.toList());
        Map<Integer,Integer> map = new HashMap<>();

        for(Integer i : arr){
            Integer count = map.get(i);
            if(count == null)
                map.put(i,1);
            else
                map.put(i,++count);
        }
        Set<Map.Entry<Integer,Integer>> set =    map.entrySet();

        for(Map.Entry<Integer,Integer> it : set){
            System.out.println(it.getKey()+"  "+it.getValue());

        }

    }

    private static void countDIstinctEle(int[] n) {

        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i< n.length ; i++){
            set.add(n[i]);
        }
        System.out.println(set.size());

    }

    private static void transposeMatrix(int[][] a) {

        for(int i = 0 ; i < a.length ; i++){
            for(int j = i ; j < a.length ; j++){
                System.out.println(a[i][j]);
            }
        }
        System.out.println(" ");
    }

    private static void printSnakePattern(int[][] a) {

        for(int i = 0 ; i < a.length ; i++){
            {
                 if(i%2 == 0){
                     for(int j = 0 ; j < a[i].length ; j++)
                     System.out.println(a[i][j]);
                 }else{
                     for(int j = a[i].length -1 ; j >= 0 ; j--)
                     System.out.println(a[i][j]);
                 }
            }
            System.out.println( );
        }
    }

    private static int repeatinfEle(int[] n) {
        boolean visitedArr[] = new boolean[n.length];
        for(int i = 0 ; i < visitedArr.length ; i++)
            visitedArr[i] = false;
        for(int i = 0 ; i < n.length ;i++){
            if(visitedArr[n[i]])
                return n[i];
            visitedArr[n[i]] = true;
        }
        return 0;
    }

    private static void medianOfSortedArr(int[] a, int[] b) {
        List<Integer> x = new ArrayList<>();
        for(int i = 0 ; i < a.length ; i++)
        x.add(a[i]);
        for(int i = 0 ; i < b.length ; i++)
            x.add(b[i]);
        Collections.sort(x);

        int size = x.size();

        if(size%2 != 0)
            System.out.println(x.get(size / 2));
        else{
          int c =   x.get(size/2);
          int d =  x.get(size/2-1);
            System.out.println(c+" "+d);
            double evenSUm = (double)(c+d)/2;
            System.out.println(evenSUm);
        }

    }

    private static void sumOfTriplet(int[] n, int x) {
    Arrays.sort(n);
        for(int i = 0 ; i < n.length -2 ; i++){
          List<Integer> p =  thirdNum1(n,x,x-n[i],i+1);
        if(p.size() > 0){
            System.out.println(n[i]+" "+p);
        }


    }

    }

    private static List<Integer> thirdNum1(int[] n, int x, int remainning, int i1) {
        int start = i1;
        int end = n.length -1;
List<Integer> b = new ArrayList<>();
        while(start <= end){
            if(n[start]+ n[end]==remainning){
            b.add(n[start]);
            b.add(n[end]);
            break;
            }
            else if(n[start]+n[end] < remainning)
                start++;
            else
                end--;
        }return b;
    }


    private static void sumOfNums(int[] n, int sum) {
        int extraNum = 0;
       for(int i = 0 ;i < n.length ; i++){
           if(n[i] == sum)
               System.out.println("the num "+n[i]);
           else if(n[i] < sum){
             extraNum =  sum - n[i];
             int b =maxsum(n,extraNum);
               System.out.println(" the nums are :"+n[i]+" "+b);

           }
       }
    }

    private static int maxsum(int[] n, int extraSum) {
        for(int i = 0 ; i < n.length ; i++){
            if(n[i] == extraSum){
                return extraSum;
            }


        }
        return extraSum;
    }

    private static int maxSumArray(int[] n, int k) {

        int start = 0;
        int end = 0 ;
        int maxNum = n.length;
        int maxSum = 0;
        while(end < maxNum){
            if(end-start +1 < k)
                end++;
            else if(end-start +1 == k && end < maxNum){
                int sum = 0;
                for(int i = start ; i <= end ; i++){
                    sum = sum + n[i];
                }
                maxSum = max(sum,maxSum);
                start++;
                end++;
            }else
                return -1;
        }return maxSum;
    }

    private static void peakEle(int[] n) {
        if(n[0] > n[1])
            System.out.println(n[0]);
        if(n[n.length -1] > n[n.length -2])
            System.out.println(n[n.length -1]);

        for(int i = 1 ; i < n.length -1 ; i++)
            if(n[i] > n[i-1] && n[i] > n[i+1])
                System.out.println(n[i]);
    }

    private static int firstLastOccurence(int[] n, int num, int start, int end) {

        int res = -1;
        while(start <= end){
            int mid = start + (end - start)/2;

            if(n[mid] < num)
                start = mid +1;
            else if(n[mid] > num)
                end =mid -1;
            else{
                res = mid;
                start = mid +1;
            }
        } return res;
    }

    private static int firstIndexOccurence(int[] n, int num, int start, int end) {


        while(start <= end){
            int mid = start +(end - start)/2;
            if(n[mid] < num){
                start = mid +1;

            }else if(n[mid] > num){
                end = mid -1;

            }else if(n[mid] == num ){
                start = mid +1 ;
            }
                return mid;
        } return -1;

    }

    private static void stockbuySell(int[] n) {
        int max_curr = 0;
        int max_total = Integer.MIN_VALUE;

        for(int i = 1 ; i < n.length ; i++){
            if(n[i] > n[i-1]){
                max_curr += n[i] -n[i-1] ;
            }
        }
        System.out.println(max_curr);

    }

    private static boolean equilibriumPoint(int[] n) {
        int l = 0;
        int sum = 0;
        for(int i = 0 ; i < n.length ; i++){
            sum += n[i];
        }

        for(int i = 0 ; i< n.length ; i++){
            sum -= n[i];

            if(sum == l) {
                System.out.println("equilibrium point is :"+n[i]);
                return true;
            }
            else{

                l = l+n[i];
            }
        }
        return false;
    }

    private static void prefixSum(int start, int end,int[] n) {
        int sum = 0;
        for(int i = start ; i <= end ; i++){
            sum += n[i];
        }
        System.out.println(sum);
    }

  /*  private static void subArraySum(int[] n, int sum) {
        int a = 0;
        int p = 0;
        for(int i = 0 ; i < n.length ; i++) {
            a = a + n[i];
            if (a < sum)
                return false;
        }

        for(int i = 0 ; i< n.length ; i++){
            p += n[i];
            while(sum < p){
                p

            }
            if(p == sum)
                return true;
            else if(p < sum){

            }
        }

    }*/

    private static void firstNegativeNum(int[] n,int k) {
        int start = 0;
        int end = 0;
        int counter = 0;

        while(end< n.length){
            if(end-start+1<k)
                end++;
            else if(end-start+1==k){
                while(counter < end){
                    if(n[counter] < 0){
                        System.out.println(" the negative no :"+n[counter]);
                        break;
                    }else{
                        counter++;
                    }
                }
                end++;
                start++;
                counter = start;

            }

        }
    }

    private static int slidingwindow(int[] n, int k) {
        int start = 0;
        int end= 0;
        int sum = 0;
        int res = 0;
        while(end < n.length){
            sum += n[end];
            if(end-start+1 <k)
                end++;
            else if(end-start+1==k){
                res = max(res,sum);
                sum = sum - n[start];
                end++;
                start++;
            }else {
                return -1;
            }
        } return res;
    }

    private static void minCOnseFlip(int[] n) {
        int count = 0;
        int count1 = 0;
        int res = 0;
        for(int i = 0 ; i < n.length ; i++){
            if(n[i] == n[i+1] && n[i] ==1)
                count++;
            else if(n[i] == n[i+1] && n[i] ==1)
                count1 --;
        } res = max(count,count1);
    }


    private static void majorityEle(int[] n) {
        //o(n) time complexity
        int count = 1;
        int res = -1;
     for(int i = 0 ; i< n.length-1;i++){
        if(count == 0){
            count =1;
            res = n[i];
        }
        else{
            if(n[i] == res)
                count++;
            else
                count --;
        }

     } int freq = 0;
     for(int i = 0 ; i< n.length ; i++){
         if(n[i] == res)
             freq++;
     } if(freq > n.length/2)
            System.out.println("The majority element is :"+res+" with occurence : "+freq);
     else
            System.out.println(-1);








    // o(n^2) time complexity

      /*  int size = n.length;
        int res = Integer.MIN_VALUE;
        for(int i = 0 ; i < n.length ; i++){
            int counter = 1;
            for(int j = i ; j < n.length ; j++){
                if(n[i] == n[j]) {
                    res = max(res, counter);
                    counter++;
                }
            }
        }
        if(res > size/2)
            System.out.println(""+res);
        else
            System.out.println("not found");*/
    }

    private static int maxcircularsubarray(int[] n) {
        int res = 0;
        int res1 = 0;
        int counter = 0 ;
        int counter1 = 0;
        int sum = 0;
        for(int i = 0 ; i < n.length ; i++)
            sum += n[i];
        for(int i = 0 ; i < n.length ; i++){
          counter =  max(counter+n[i],n[i]);
          res = max(res,counter);
        }
        for(int i = 0 ; i < n.length ; i++){
            counter1 =  min(counter1+n[i],n[i]);
            res1 = min(res1,counter1);
        }
       return  max(res,sum-res1);

    }

    private static void maxLengthEvenOdd(int[] n) {

        int count = 1;
        int i = 0;
        int size = n.length-1;
        while(i<size){
            if((n[i]%2 == 0 && n[i+1]%2 != 0) || (n[i]%2 != 0 && n[i+1]%2 == 0)){
                count++;
            }
            else
                count = 1;
            i++;
        }
        System.out.println(count);
    }

    private static void maxsubArraySum(int[] n) {
/*       int res = n[0];
       for(int i = 0 ; i < n.length ; i++){
           int counter = 0;

           for(int j = i ; j < n.length ; j++){
            counter =  counter + n[j];
            res = max(res,counter);
           }
       }
        System.out.println( res);*/

        int res = n[0] ;
        int count = n[0];
        for(int i = 0 ; i < n.length ; i++){
          count = max(count+n[i],n[i]);
          res = max(res,count);
        }
        System.out.println(res);
    }

    private static void maxConsecutive1(int[] n) {

        int count = 0;
        int sum = 0;
        for(int i = 0 ; i < n.length-1 ; i++){
            if(n[i]==1){
                count++;
                sum = max(sum,count);
            }
            else{
                count = 0;
            }
        }
        System.out.println(sum);
    }

    private static void trappingRainWater(int[] n) {
        int size =n.length;
        int lmax[] = new int [size];
        int rmax[] = new int [size];
        int res = 0;
        lmax[0] = n[0];
        for(int i =1 ; i < n.length ; i++)
            lmax[i] = max(n[i],lmax[i-1]);

        rmax[size -1] = n[size -1];
        for(int i = size -2 ; i >=0 ; i--)
            rmax[i]=max(n[i],rmax[i+1]);

        for(int i = 0 ; i < size ; i++)
            res += min(lmax[i],rmax[i]) - n[i];

        System.out.println(res);
    }

    private static void frequencyARray(int[] n) {
        int count = 0;
      /*  for(int i = 1 ; i < n.length ; i++){
            if(n[i-1]==n[i])
                count++;
            else{
                System.out.println(" the number "+n[i-1]+ " has max count of "+count);
                count=1;
            }
        }
        System.out.println(" the number "+(n[n.length-1])+ " has max count of "+1);*/

        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < n.length ; i++){
            Integer count1 = map.get(n[i]);

            if(count1 == null)
                map.put(n[i],1);
else {
                map.put(n[i], ++count1);
            }

        }

       Set<Map.Entry<Integer,Integer>> it = map.entrySet();
        for(Map.Entry<Integer,Integer> e : it)

            System.out.println(" the key is :"+e.getKey()+"  the frequency is:"+e.getValue());


    }

    private static void maxDiff(int[] n) {
      /*  Arrays.sort(n);
        int diff = n[n.length -1] - n[0];
        System.out.println("the max diff is :"+diff);*/

        int diff = n[1]-n[0];
        int minVal = n[0];

        for(int i = 1 ; i < n.length ; i++){
            diff = max(diff, n[i]-minVal);
            minVal= min(n[i],minVal);
        }

        System.out.println(diff);
    }

    private static void moveZerotoEnd(int[] n) {
        int arr[] = new int[n.length];
        int size = n.length ;
        int j = 0;
        int k = n.length;
        for(int i = 0 ; i < size ; i++){
            if(n[i] != 0) {
                arr[j] = n[i];
                j++;
            }else{
                arr[k-1]= n[i];
                k--;
            }

        }
        for(int i = 0 ; i < arr.length ; i++)
            System.out.println(arr[i]);
    }

    private static void removeduplicates(int[] n) {
        Set<Integer> set = new LinkedHashSet<>();

        for(int i : n){
            set.add(i);
        }
        System.out.println(set);

    }

    private static void largestVal(int[] n) {
       /* int l = n[0];
        for(int i = 0 ; i < n.length-1 ; i++){
            if(n[i]>n[i+1])
                l=n[i];

            if(n[i] != l )

        }
        if(l < n[n.length -1])
            l=n[n.length -1];


        System.out.println("largest num :"+l);*/

        int largest = Integer.MIN_VALUE;
        int secondLargest= Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for(int i = 0 ; i < n.length ; i++){
            if(n[i] > largest){
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = n[i];
            }
        }

        System.out.println(" The largest :"+largest + " Second largest : "+secondLargest + " Third largest :"+thirdLargest);
    }

    private static void sumOfDigit(int n) {
        int s = 0;

        while(n > 0 || s>9){

            if(n==0){
                n=s;
                s=0;}
           s = s +  n%10;
           n=n/10;

        }



        System.out.println(s);
    }

    public static int sumOf(int n) {

        if (n == 0)
            return 0;
            return n + sumOf(n - 1);

    }

    private static void rec(int n,int i) {

        if(i>n)
            return ;
        else{

            System.out.println(n);

        }rec(n,i+1);

    }
}
