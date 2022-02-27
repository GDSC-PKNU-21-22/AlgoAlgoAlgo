package programmers.level1;

import java.util.Arrays;
import java.util.PriorityQueue;

public class 나누어떨어지는숫자배열 {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor = 5;

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : arr) {
            if (i % divisor == 0) {
                pq.add(i);
            }
        }
//        if (pq.size() == 0) {
//            return new int[] {-1};
//        }

        int[] answer = new int[pq.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = pq.remove();
        }

        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
    }
}
