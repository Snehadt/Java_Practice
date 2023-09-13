import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntegerDistinctUsingStream {
    public static void main(String[] args) {
        List<Integer> lt = Arrays.asList(1,2,3,4,5,4,6);
        int[] a= {1,2,3,4,4,5,6,7,8,8,8};
      /* List ltt = lt.stream().distinct().collect(Collectors.toList());
       System.out.println(ltt);*/

      // List ltt =  lt.stream().filter(x->x>3).distinct().collect(Collectors.toList());

      // List<Integer> st = Arrays.stream(a).distinct().boxed().collect(Collectors.toList());
        List<Integer> st = Arrays.stream(a).filter(i->i>=6).distinct().boxed().collect(Collectors.toList());
        System.out.println(st);

    }
}
