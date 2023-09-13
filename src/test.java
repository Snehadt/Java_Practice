import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class test {
    public static void main(String[] args) {
        /*String s = "aaaabbbcccddddddd";

        countMax(s);*/

       /* int [] arrA = {6,2,7,8,2,4,1,3,7,5};
        int n = 8;
        findset(arrA,n);*/

        int arr[] = {1,2,1,3};
        int diff = 1;
        countofSubsetWithGivenDiff(arr,diff);
    }

    private static void countofSubsetWithGivenDiff(int[] arr, int diff) {
        int sum = 0;
        int size = arr.length;
        for(int i = 0 ; i < arr.length ; i++)
            sum += arr[i];
        int sum1 = (sum + diff)/2;

        System.out.println(countOfSubSet(arr,sum1,size));
    }

    private static int countOfSubSet(int[] arr, int sum, int size) {
        int t[][] = new int[size+1][sum+1];
        for(int i = 0 ; i < sum+1 ; i++)
            t[0][i] = 0 ;
        for(int j = 0 ; j < size+1 ; j++)
            t[j][0] = 1;
        for(int i = 1 ;  i< size+1 ; i++){
            for(int j = 1 ; j < sum+1 ; j++){
                if(arr[i-1]<=j)
                   t[i][j] = t[i-1][j]+t[i-1][j-arr[i-1]];
                else
                    t[i][j] = t[i-1][j];
            }
        } return t[size][sum];
    }

    private static void findset(int[] arrA, int n) {
        Arrays.sort(arrA);
        List<Integer> combinationList = new ArrayList<>();
        findset2(arrA,n,0,0,combinationList);
    }

    private static void findset2(int[] arrA, int sum, int currSum, int start, List<Integer> combinationList) {
        if(currSum==sum) {
            System.out.println(combinationList);
            return;
        }

        int prevElement = -1;
        for (int i = start; i <arrA.length ; i++) {
            if(prevElement!=arrA[i]) {
                if(currSum+arrA[i]>sum) //array is sorted, no need to check further
                    break;
                combinationList.add(arrA[i]);
                findset2(arrA, sum, currSum + arrA[i], i + 1, combinationList);
                combinationList.remove(combinationList.size() - 1);
                prevElement = arrA[i];
            }
        }
    }

    private static Character countMax(String s) {

        return s.chars().mapToObj(x-> (char)x).
        collect(groupingBy(x -> x, counting())).
                entrySet().stream().max(comparingByValue()).get().getKey();
    }
}
