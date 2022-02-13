package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Consumer;

public class 다리를지나는트럭 {
    public static void main(String[] args) {
        다리를지나는트럭 tcb = new 다리를지나는트럭();

        int solution = tcb.solution(2, 10, new int[]{7, 4, 5, 6});
        System.out.println("solution = " + solution);

        solution = tcb.solution(100, 100, new int[]{10});
        System.out.println("solution = " + solution);

        solution = tcb.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10});
        System.out.println("solution = " + solution);

    }
    public int solution(int bridge_length, int weight, int[] truck_weights) {

        Queue<Integer> bridge = new LinkedList<>();
        int[] inputTime = new int[truck_weights.length];

        bridge.add(truck_weights[0]);
        int time = 1;
        int index = 1;
        inputTime[0] = 1;
        int out = 0;
        while (!bridge.isEmpty()) {
//            System.out.println("========");
//            System.out.println("index = " + index);
//            System.out.println("time = " + time);
            if (time - inputTime[out] == bridge_length) {
                Integer remove = bridge.remove();
//                System.out.println("remove = " + remove);
                out++;
            }
//            System.out.println("Arrays.toString(inputTime) = " + Arrays.toString(inputTime));
//            System.out.println("bridge = " + bridge);

            if (time != 1 && isPossible(bridge, index, bridge_length, weight, truck_weights)) {
                inputTime[index] = time;
//                System.out.println("inputTime = " + time);
                bridge.add(truck_weights[index++]);
            }
//            System.out.println("bridge = " + bridge);
            time++;
        }
        return time - 1;
    }

    private boolean isPossible(Queue<Integer> bridge, int index, int bridge_length, int weight, int[] truck_weights) {
        if (truck_weights.length  <= index) {
            return false;
        }
        if (bridge.size() >= bridge_length) {
            return false;
        }
        int sum = 0;
        for (Integer integer : bridge) {
            sum += integer;
        }
        if (sum + truck_weights[index] > weight) {
            return false;
        }
        return true;
    }

}
