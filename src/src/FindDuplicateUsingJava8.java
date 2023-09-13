package src;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class FindDuplicateUsingJava8 {
    public static void main(String[] args) {

    /*    List<Integer> list = Arrays.asList(1, 2, 3, 2, 1, 4, 6, 5, 4);
        Set<Integer> set = new HashSet();
        Set<Integer> st = list.stream().filter(l -> !set.add(l)).collect(Collectors.toSet());
    st.forEach(System.out::println);*/

        String s = "aaaabbbcccddddddde";
/*Map<Character,Long> st =
        s.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(x -> x,Collectors.counting()));


        System.out.println(st);*/

        s.chars().mapToObj(x -> (char)x).collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream().max(comparingByValue()).get().getKey();

    }
}
