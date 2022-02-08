package level1;

import java.util.Arrays;

public class 다트게임 {
    public static void main(String[] args) {

        System.out.println(solution("1D2S#10S"));

    }

    public static int solution(String dartResult) {
        int[] score = {0, 0, 0};

        int pointer = -1;
        for (int i = 0; i < dartResult.length(); i++) {
            String word1 = dartResult.substring(i, i + 1);
            String word2 = "";
            if (i + 1 < dartResult.length()) {
                word2 = dartResult.substring(i, i + 2);
            }

            String key = "";
            try {
                Integer.parseInt(word2);
                key = word2;
                i++;
            } catch (NumberFormatException nfe) {
                key = word1;
            }

            if (isScore(key)) {
                pointer++;
                score[pointer] = Integer.parseInt(key);
            } else if (key.equals("D")) {
                score[pointer] = (int) Math.pow(score[pointer], 2);
            } else if (key.equals("T")) {
                score[pointer] = (int) Math.pow(score[pointer], 3);
            } else if (key.equals("*")) {
                score[pointer] *= 2;
                if (pointer > 0) {
                    score[pointer - 1] *= 2;
                }
            } else if (key.equals("#")) {
                score[pointer] *= -1;
            }
        }

        int answer = Arrays.stream(score).sum();

        return answer;
    }

    private static boolean isScore(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }


}

