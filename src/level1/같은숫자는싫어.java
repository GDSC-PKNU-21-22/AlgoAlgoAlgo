package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};

        ArrayList<Integer> list = new ArrayList<>();

        int before = -1;
        for (int i : arr) {
            if (i != before) {
                list.add(i);
            }
            before = i;
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }

        System.out.println("list = " + Arrays.toString(answer));

    }
}
