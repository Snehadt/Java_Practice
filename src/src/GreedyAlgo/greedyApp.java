package src.GreedyAlgo;

import java.util.Arrays;
import java.util.Comparator;

public class greedyApp {

    int start;
    int finish;

    greedyApp(int start,int finish){

        start = this.start;
        finish = this.finish;
    }

 
    public static void main(String[] args) {
        greedyApp arp[] = {
                new greedyApp(12,25),
                new greedyApp(10,20),
                new greedyApp(20,30)};
        System.out.println(findMaxActivity(arp));

    }

    private static int findMaxActivity(greedyApp[] arp) {
        Arrays.sort(arp, new Myapp());

        int curr = 1;
        int prev = 0;

        for(int i = 1 ; i < arp.length ; i++){
            if(arp[i].start >= arp[prev].finish){
                curr++;
                prev = i;
            }
        } return curr;
    }
 static class Myapp implements Comparator<greedyApp>{

    @Override
    public int compare(greedyApp o1, greedyApp o2) {
        return o1.finish- o2.finish;
    }
}

}
