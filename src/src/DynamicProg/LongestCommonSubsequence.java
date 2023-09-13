package src.DynamicProg;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        //print the length of longest subsequence
        //ans - abdh - 4
     /*   String x = "abcdghf";
        String y = "aebcef";
        int n = x.length();
        int m = y.length();
        //recursive code
       // System.out.println(lcsRecursive(x,y,n,m));
        //memozized code
      //  System.out.println(lcsMemozize(x,y,n,m));
        //bottom up approach
        System.out.println(lcsBottomup(x,y,n,m));*/

        //Longest common substring
       /* String x = "abcdef";
        String y = "acdesef";
        int n = x.length();
        int m = y.length();
        System.out.println(longestCommonSubstring(x,y,n,m));*/

        //print the longest common subsequence
      /*  String x = "abcdef";
        String y = "acdesef";
        int n = x.length();
        int m = y.length();

        System.out.println(printLCS(x,y,n,m));*/

        //Shortest common Supersequence
        //ans - AGXGTXAYB - 9
      /*  String x = "AGGTAB";
        String y = "GXTXAYB";

        System.out.println(sizeOfShortestCommonSupersequence(x,y));*/

        //min number of Insertion and Deletion to convert String a to b.
        //String a = heap
        //String b = pea
        //ans - 2 deletion 1 insertion

      /*  String a =  "heap";
        String b = "pea";
        
        minNoOfDelInsert(a,b);*/

        //Longest pallindromic subsequence
        //ans- abcba - length 5
       /* String s = "agbcba";
        System.out.println(lps(s));*/
    //Min number of deletion in a string to make it Pallindrome
    //Min number of insertion in a string to make it Pallindrome
        /*String s = "agxbcba";
        System.out.println(minDeletion(s));*/

    //print Shortest common Supersequence
        //ans - AGXGTXAYB
      /*  String x = "AGGTAB";
        String y = "GXTXAYB";
        System.out.println(printShortestSupersequence(x,y));*/

      // Longest repeating subsequence
        //ans - ABD - 3
      /*  String s = "AABEBCDD";
        System.out.println(longestRepeatingSubsequence(s));*/

      // sequence pattern matching
       // ans - true;
     /* String x = "AXY";
      String y = "ADXCPY";

        System.out.println(sequencePatternMatching(x,y));*/
     // min number of insertion to make a pallindrome
     String s = "acbcbda";

    }

    private static boolean sequencePatternMatching(String x, String y) {
        int m = x.length();
        int n = y.length();
        boolean flag = true;

        int t[][] = new int[m+1][n+1];

        for(int i = 0 ; i < n+1 ; i++)
            t[0][i]= 0;
        for(int i = 0 ; i < m+1 ; i++)
            t[i][0] = 0;

        for(int i = 1 ; i < m+1 ; i++){
            for(int j =1 ; j < n+1 ; j++){
                if(x.charAt(i-1)==y.charAt(j-1))
                    t[i][j] = 1+t[i-1][j-1];
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        } if(t[m][n]==x.length())
            flag = true;
           else
            flag = false;
        return flag;
    }

    private static int longestRepeatingSubsequence(String s) {
        String s1 = s;
        int m = s.length();
        int t[][] = new int[m+1][m+1];

        for(int i = 0 ; i < m+1;i++)
        t[0][i] = 0;
        for(int i = 0 ; i < m+1 ; i++)
            t[i][0] =0;

        for(int i = 1 ; i < m+1 ; i++){
            for(int j = 1 ; j <m+1 ; j++){
                if(s.charAt(i-1)== s1.charAt(j-1)&& i != j)
                    t[i][j] = 1+ t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        }return t[m][m];
    }

    private static String printShortestSupersequence(String x, String y) {
        int m = x.length();
        int n = y.length();
        String s1 = "";

        int t[][] = new int[m+1][n+1];

        for(int i = 0 ; i < n+1 ; i++)
            t[0][i] = 0;
        for(int j = 0 ; j < m+1 ; j++)
            t[j][0] = 0;

        for(int i = 1 ; i < m+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(x.charAt(i-1) == y.charAt(j-1))
                    t[i][j] = 1+ t[i-1][j-1];
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }int q = m;
        int w = n;

        while(q > 0 && w > 0){
            if(x.charAt(q-1)==y.charAt(w-1)){
                s1 = s1+x.charAt(q-1);
                q--;
                w--;
            }else{
                if(t[q-1][w]>t[q][w-1]){
                    s1=s1+x.charAt(q-1);
                    q--;
                }else{
                    s1=s1+y.charAt(w-1);
                    w--;
                }
            }
        }while(q > 0){
            s1=s1+x.charAt(q-1);
            q--;
        }while(w>0){
            s1=s1+y.charAt(w-1);
            w--;
        }
        String ans= "";
        char[] qbc = s1.toCharArray();
        for(Character s : qbc)
             ans = s+ans;
        return ans;
    }

    private static int minDeletion(String s) {
        int t[][] = new int[s.length()+1][s.length()+1];
        int m = s.length();
        String s1 = "";
        char[] ch = s.toCharArray();
        for(Character c : ch)
            s1 = c+s1;

        for(int i = 0 ; i < m+1;i++ )
            t[0][i] = 0;
        for(int i = 0 ; i < m+1 ; i++)
            t[i][0] = 0;

        for(int i = 1 ; i < m+1 ; i++){
            for(int j =1 ; j < m+1 ; j++){
                if(s.charAt(i-1)==s1.charAt(j-1))
                    t[i][j] = 1+t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        } return (m-t[m][m]);
    }

    private static int lps(String s) {
        String s1 = "";
        char[] ch = s.toCharArray();
        for(char c : ch)
            s1 =c+s1;

        int m = s.length();
        int n = s1.length();
        int t[][] = new int[m+1][n+1];

        for(int i = 0 ; i < n+1;i++)
            t[0][i]= 0;
        for(int j = 0 ; j < m+1 ; j++)
            t[j][0] =0;

        for(int i = 1 ; i < m+1 ; i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(s.charAt(i-1)==s1.charAt(j-1))
                    t[i][j]=1+t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        }return t[m][n];
    }

    private static void minNoOfDelInsert(String a, String b) {
        int m = a.length();
        int n = b.length();

        int t[][] = new int[m+1][n+1];
        for(int i =0 ; i < n+1 ;i++)
            t[0][i] = 0;
        for(int j = 0 ; j < m+1 ; j++)
            t[j][0] =0;
        for(int i =1 ; i < m+1 ;i++){
            for(int j = 1 ; j < n+1 ; j++){
                if(a.charAt(i-1)==b.charAt(j-1))
                    t[i][j] = 1+ t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        }

        System.out.println("Deletion :"+ (m- t[m][n]));
        System.out.println("Insertion :"+ (n- t[m][n]));

    }

    private static int sizeOfShortestCommonSupersequence(String x, String y) {
        int m = x.length();
        int n = y.length();

        int totalLn = m+n;

        int t[][] = new int[m+1][n+1];

        for(int i = 0 ; i < n+1 ; i++)
            t[0][i] = 0;
        for(int j = 0 ; j < m+1 ; j++)
            t[j][0] = 0;

        for(int i = 1 ; i < n+1 ; i++){
            for(int j = 1 ; j < m+1 ; j++){
                if(x.charAt(i-1)== y.charAt(j-1))
                    t[i][j] = 1+ t[i-1][j-1];
                else{
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        } return totalLn - t[m][n];
    }

    private static String printLCS(String x, String y, int n, int m) {
      int t[][] = new int[n+1][m+1];
      for(int i = 0 ; i < m+1; i++)
          t[0][i] = 0;
      for(int i = 0 ; i < n+1 ; i++)
          t[i][0] = 0;

      for(int i = 1 ; i < n+1 ; i++){
          for(int j = 1 ; j < m+1 ; j++){
              if(x.charAt(i-1)==y.charAt(j-1))
                  t[i][j] = 1+t[i-1][j-1];
              else
                  t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
          }
      }
      int q = n;
      int w = m;
      String s = "";
      while(q>0 && w > 0){
          if(x.charAt(q-1)==y.charAt(w-1)){
              s = x.charAt(q-1)+s;
              q--;
              w--;
          }else{
              if(t[q-1][w]>t[q][w-1])
                  q--;
              else
                  w--;
          }
      }return s;
    }

    private static int longestCommonSubstring(String x, String y, int n, int m) {
        int t[][] = new int[n+1][m+1];
        for(int i= 0; i < n+1;i++){
            for(int j = 0 ; j < m+1 ; j++){
                if(i==0||j==0)
                     t[i][j] = 0;
            }
        }
        int max_ln = Integer.MIN_VALUE;

        for(int i= 1; i < n+1;i++){
            for(int j = 1 ; j < m+1 ; j++){
                if(x.charAt(i-1)==y.charAt(j-1)) {
                    t[i][j] = 1+t[i-1][j-1];
                    max_ln = Math.max(t[i][j],max_ln);
                }
                else
                    t[i][j]=0;

            }
        }
        return max_ln;
    }

    private static int lcsBottomup(String x, String y, int n, int m) {
        int t[][] = new int[n+1][m+1];
        for(int i = 0 ; i < n+1;i++){
            for(int j = 0 ; j <m+1;j++){
                if(i==0||j==0)
                    t[i][j] = 0;
            }
        }

        for(int i = 1 ; i < n+1;i++){
            for(int j = 1 ; j <m+1;j++){
                if(x.charAt(i-1) == y.charAt(j-1))
                    t[i][j] = 1+ t[i-1][j-1];
                else
                    t[i][j] = Math.max(t[i-1][j],t[i][j-1]);
            }
        }return t[n][m];
    }

    private static int lcsMemozize(String x, String y, int n, int m) {
        if(n==0||m==0)
            return 0;
        int t[][] = new int[n+1][m+1];
        for(int[] row : t)
        Arrays.fill(row,-1);

        if(t[n][m] != -1)
            return t[n][m];
        else if(t[n][m] == -1){
            if(x.charAt(n-1)==y.charAt(m-1))
                t[n][m]= 1+lcsMemozize(x,y,n-1,m-1);
            else
                t[n][m]= Math.max(lcsMemozize(x,y,n-1,m),lcsMemozize(x,y,n,m-1));
        }return t[n][m];

    }

    private static int lcsRecursive(String x, String y,int n,int m) {

        if(n==0 || m == 0)
            return 0;

        if(x.charAt(n-1)==y.charAt(m-1))
            return 1+ lcsRecursive(x,y,n-1,m-1);
        else
            return Math.max((lcsRecursive(x,y,n-1,m)),(lcsRecursive(x,y,n,m-1)));
    }
}
