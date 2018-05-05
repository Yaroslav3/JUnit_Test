package junitTestExamle;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(StringsUtil.fromDouble(25.4));
        System.out.println(StringsUtil.toDouble("3.1415"));
        System.out.println(StringsUtil.isEmpty(""));
        System.out.println(Arrays.toString(StringsUtil.toArray("hello i'm your crazy friend", ' ')));

        String[] elem ={"hello", "i'm", "Java" };
        System.out.println(StringsUtil.joinArray(elem, '-'));

    }
}
