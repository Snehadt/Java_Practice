package src;

import java.util.Arrays;

public class TestChildClass {

    public static void main(String[] args) {
        String s = "dgdedglgwalmrtawijliyhqw";
        System.out.println(method1(s));
    }


static boolean method1(String s) {
if(s.contains("walmrta")||s.contains("walmart")||s.contains("tmarwal"))
    return true;
else
    return false;
}

}
