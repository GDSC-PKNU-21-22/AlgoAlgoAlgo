package programmers.level4;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.Predicate;

public class 무지의먹방라이브 {
    public static void main(String[] args) {

        무지의먹방라이브 s = new 무지의먹방라이브();
        int solution = s.solution(new int[]{8, 6, 4}, 15);
        System.out.println("solution = " + solution);
    }


    class Element implements Comparable<Element> {
        int index;
        int value;

        public Element(int index, int value) {
            this.index = index;
            this.value = value;
        }

        @Override
        public int compareTo(Element o) {
            return this.value - o.value;
        }
    }
    public int solution(int[] food_times, long k) {
        long sum = 0;
        for (int i = 0; i < food_times.length; i++) {
            sum += food_times[i];
        }
        if (sum < k) {
            return -1;
        }

        PriorityQueue<Element> pq = new PriorityQueue<>();
        for (int i = 0; i < food_times.length; i++) {
            pq.offer(new Element(i + 1, food_times[i]));
        }

        sum = 0;
        long previous = 0;
        long length = food_times.length;


        while (sum + (pq.peek().value - previous) * length <= k) {
            int now = pq.poll().value;
            sum += (now - previous) * length;
            length -= 1;
            previous = now;
        }

        ArrayList<Element> ar = new ArrayList<>();
        while (!pq.isEmpty()) {
            ar.add(pq.poll());
        }

        Collections.sort(ar, new Comparator<Element>() {
            @Override
            public int compare(Element o1, Element o2) {
                return o1.index - o2.index;
            }
        });

        return ar.get((int) ((k - sum) % length)).index;

    }
}
