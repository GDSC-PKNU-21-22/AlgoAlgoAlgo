package programmers.level1;

import java.util.Arrays;

public class 문자열내림차으로배치하기 {
    public static void main(String[] args) {
        String s = "Zbcdefg";

        char[] arr = s.toCharArray();

        Arrays.sort(arr);
        String answer = reverse(arr);

        System.out.println("answer = " + answer);

    }

    private static String reverse(char[] arr) {
        StringBuilder answer = new StringBuilder(arr.length);
        for (int i = arr.length - 1; i >= 0; i--) {
            answer.append(arr[i]);
        }
        return answer.toString();
    }

    private static void sort(char[] arr) {

    }
}
