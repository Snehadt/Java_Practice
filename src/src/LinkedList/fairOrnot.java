package src.LinkedList;

import java.util.*;

public class fairOrnot {
    public static void main(String[] args) {
      /*  int A[] = {2,-2,-3,3};
        int B[] = {0,0,4,-4};

        System.out.println( fairOrNot(A,B));*/

      /*  int n[] = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDup(n));;*/

        int price[]= {1,3,2,8,4,9};
        int fee = 2;

        maxProfit(price,fee);



    }

    private static void maxProfit(int[] n, int fee) {
        for(int i = 0 ; i < n.length ; i++){

        }
    }

    private static int removeDup(int[] n) {

       /* Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i < n.length ; i++){
            Integer count = map.get(n[i]);
            if(count == null)
                map.put(n[i],1);
            else
                map.put(n[i],++count);
        }
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();

        List<Integer> l = new ArrayList<>();
        int i = 0;
        for(Map.Entry<Integer,Integer> s : set){
            if(s.getValue() <=2) {
                l.add(s.getKey());
              //  l.set(i, s.getKey());

            }
        } return l.size();*/

      /*  List<Integer> set = new ArrayList<>();
        int count = 1;
        for(int i = 0 ; i < n.length ; i++){
            if(set.contains(n[i]) && count <2){
                set.add(n[i]);
            count++;
            }
            else if(!set.contains(n[i])){
                set.add(n[i]);
                count=1;}
        }

        for(int i = 0 ; i < set.size() ; i++){
            System.out.println(set.get(i));
        }
            return set.size();*/

      /*  int j=1;
        for(int i=2;i<n.length;i++)
            if(n[i]!=n[j-1])
                n[++j]=n[i];
        return j+1;*/
        int in = 2;

        for(int i = 2 ; i < n.length ; i++)
            if(n[i] != n[in-2])
                n[in++] = n[i];

            return in;

    }

    private static int fairOrNot(int[] a, int[] b) {

        Set<Integer> set = new HashSet<>();



        if(a.length != b.length)
            return -1;
        int k = 1;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        for(int i = 0 ; i < a.length ; i++){
            sum1 += a[i];
            sum2 += b[i];

            if(sum1 == sum2){
                for(int j = i+1 ; j < a.length ; j++){
                    sum3 += a[j];
                    sum4 += b[j];
                }if(sum3 == sum4 && sum1 == sum3)
                    return k;
                else{
                    k++;
                    sum3 = 0;
                    sum4 = 0;

                }

            }k++;
        }
        return k;
    }
}
