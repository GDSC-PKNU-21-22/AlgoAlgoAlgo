package programmers.level3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class 여행경로 {
    public static void main(String[] args) {
        여행경로 tr = new 여행경로();

//        String[][] arr = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
//        String[] solution = tr.solution(arr);
//        System.out.println("Arrays.toString() = " + Arrays.toString(solution));

        String[][] arr2 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        String[] solution1 = tr.solution(arr2);
        System.out.println("Arrays.toString(solution1) = " + Arrays.toString(solution1));

    }

    HashSet<Node> discovered = new HashSet<>();
    HashSet<Node> visited = new HashSet<>();
    Node result;
    boolean isSelected;

    public String[] solution(String[][] tickets) {
        Arrays.sort(tickets, Comparator.comparing(o -> o[1]));

        Node root = new Node("ICN");
        boolean[] used = new boolean[tickets.length];
        makeTree(root, tickets, used);

        isSelected = false;
        result = null;
        dfs(root, 0, tickets.length);


        String[] answer = new String[tickets.length + 1];
        Node tmp = result;
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = tmp.value;
            tmp = tmp.backNode;
        }

        return answer;
    }

    private void dfs(Node root, int depth, int target) {

        if (discovered.contains(root) || visited.contains(root)) {
            return;
        }

        discovered.add(root);

        for (Node child : root.children) {
            dfs(child, depth + 1, target);
        }

        visited.add(root);
        if (!isSelected && (depth == target)) {
            result = root;
            isSelected = true;
        }
    }

    private void makeTree(Node root, String[][] tickets, boolean[] used) {
        for (int i = 0; i < tickets.length; i++) {
            if (tickets[i][0].equals(root.value) && !used[i]) {
                Node child = new Node(tickets[i][1]);
                child.backNode = root;
                boolean[] copy = copyArr(used);
                root.children.add(child);
                copy[i] = true;
                makeTree(child, tickets, copy);
            }
        }

    }

    private boolean[] copyArr(boolean[] used) {
        boolean[] copy = new boolean[used.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = used[i];
        }

        return copy;
    }


    class Node {
        String value;
        ArrayList<Node> children;
        Node backNode;

        public Node(String value) {
            this.value = value;
            children = new ArrayList<>();
        }
    }
}
