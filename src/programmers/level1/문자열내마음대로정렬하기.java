package programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {
        String[] strings = {"abce", "abcd", "cdx"};
        int n = 2;

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.charAt(n) - o2.charAt(n)) == 0 ? o1.compareTo(o2) : (o1.charAt(n) - o2.charAt(n));
            }
        });

        System.out.println("Arrays.toString(strings) = " + Arrays.toString(strings));
    }
}
