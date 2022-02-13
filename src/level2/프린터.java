package level2;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
    public static void main(String[] args) {
        프린터 p = new 프린터();

        int solution = p.solution(new int[]{2, 1, 3, 2}, 2);
        System.out.println("solution = " + solution);

        solution = p.solution(new int[]{1, 1, 9, 1, 1, 1}, 0);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] priorities, int location) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < priorities.length; i++) {
            q.add(i);
        }


        boolean[] isPrinted = new boolean[priorities.length];
        int answer = pop(q, location, priorities, isPrinted);

        return answer;
    }

    private int pop(Queue<Integer> q, int location, int[] priorities, boolean[] isPrinted) {

        int count = 0;
        while (!q.isEmpty()) {
            int cur = q.remove();
            if (!isPrinted[cur] && isHighestInQueue(cur, priorities, isPrinted)) {
                count++;
                isPrinted[cur] = true;
                if (cur == location) {
                    return count;
                }
            } else {
                q.add(cur);
            }
        }
        return -1;
    }

    private boolean isHighestInQueue(int cur, int[] priorities, boolean[] isPrinted) {
        int value = priorities[cur];
        int max = findMax(priorities, isPrinted);
        return value >= max;
    }

    private int findMax(int[] priorities, boolean[] isPrinted) {
        int max = -1;
        for (int i = 0; i < priorities.length; i++) {
            if (!isPrinted[i] && priorities[i] > max) {
                max = priorities[i];
            }
        }
        return max;
    }
}
