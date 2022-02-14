package programmers.level3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 단어변환 {
    public static void main(String[] args) {

        단어변환 wc = new 단어변환();
        int solution = wc.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"});
        System.out.println("solution = " + solution);
        solution = wc.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log"});
        System.out.println("solution = " + solution);
    }

    public int solution(String begin, String target, String[] words) {

        int answer = 0;
        Node root = new Node(begin);
        boolean[] used = new boolean[words.length];
        makeTree(root, words, used);

        Node node = bfs(root, target);
        if (node != null) {
            answer = calculateTrack(node);
        }

        return answer;
    }

    private int calculateTrack(Node node) {
        int count = 0;
        Node tmp = node;
        while (tmp.backNode != null) {
            tmp = tmp.backNode;
            count++;
        }
        return count;
    }

    private Node bfs(Node root, String target) {
        int level = 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node currentNode = q.remove();
            if (currentNode.value.equals(target)) {
                return currentNode;
            }

            for (Node child : currentNode.children) {
                q.add(child);
            }
        }

        return null;
    }

    private void makeTree(Node root, String[] words, boolean[] used) {
        boolean[] copy = copyArr(used);
        for (int i = 0; i < words.length; i++) {
            if (!copy[i] && isOnlyOneDifferent(root, words[i])) {
                Node child = new Node(words[i]);
                child.backNode = root;
                root.children.add(child);
                copy[i] = true;
            }
        }

        for (Node child : root.children) {
            makeTree(child, words, copy);
        }

    }

    private boolean[] copyArr(boolean[] used) {
        boolean[] copy = new boolean[used.length];
        for (int i = 0; i < copy.length; i++) {
            copy[i] = used[i];
        }

        return copy;
    }

    private boolean isOnlyOneDifferent(Node root, String word) {
        int difference = 0;

        for (int i = 0; i < word.length(); i++) {
            if (root.value.charAt(i) != word.charAt(i)) {
                difference++;
            }
        }
        return difference == 1;
    }

    class Node {
        String value;
        ArrayList<Node> children;
        Node backNode;

        public Node(String value) {
            this.value = value;
            children = new ArrayList<>();
        }

        @Override
        public String toString() {
            return value;
        }
    }

}
