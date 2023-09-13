import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class StreamFunc {
    public static void main(String[] args){
        String s = "aaaabbbcccddddddd";
        System.out.println(maxCharacter(s));
    }
    public static Character maxCharacter(String str){


     return str.chars()
             .mapToObj(x -> (char) x)                  // box to Character
            .collect(groupingBy(x -> x, counting()))  // collect to Map<Character, Long>
            .entrySet().stream()
            .max(comparingByValue())                  // find entry with largest count
            .get()
            // .getValue();                                  // or throw if source string is empty
           .getKey();



    }
}
