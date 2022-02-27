package programmers.level4;

import java.util.Arrays;

public class 무지의먹방라이브2 {
    public static void main(String[] args) {

        무지의먹방라이브2 s = new 무지의먹방라이브2();
        int solution = s.solution(new int[]{8, 6, 4}, 15);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] food_times, long k) {

        int curTime = 0;
        int i = -1;
        while (curTime <= k) {
            i = (i + 1 == food_times.length ? 0 : i + 1);

            if (food_times[i] == 0) {
                continue;
            }
            food_times[i] -= 1;
            curTime++;
        }


        return i + 1;
    }

    private int findRemainFood(int[] food_times) {
        long result = Arrays.stream(food_times).filter(i -> (i != 0)).count();
        return (int) result;
    }
}
