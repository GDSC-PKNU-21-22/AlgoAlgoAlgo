package baekjoon.greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj20365 {
    static class Node {
        int value;
        Node left;
        Node right;
        Node before;

        public Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            Node root = new Node(end);


            makeTree(root, start);

            Queue<Node> queue = new LinkedList<>();
            queue.add(root);

            Node target = null;
            while (!queue.isEmpty()) {
                Node remove = queue.remove();
                if (remove.value == start) {
                    target = remove;
                    break;
                }
                if (remove.left != null) {
                    queue.add(remove.left);
                }
                if (remove.right != null) {
                    queue.add(remove.right);
                }
            }

            if (target == null) {
                bw.write(-1 + "");
            } else {
                int count = 0;
                while (target != null) {
                    target = target.before;
                    count++;
                }

                bw.write(count + "");
            }
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    private static void makeTree(Node root, int start) {
        int value = root.value;
        if (value == 1) {
            return;
        }
        if (value % 2 == 0) {
            root.left = new Node(value / 2);
            root.left.before = root;
            makeTree(root.left, start);
        }

        String valStr = value + "";
        if (valStr.charAt(valStr.length() - 1) == '1') {
            root.right = new Node(Integer.parseInt(valStr.substring(0, valStr.length() - 1)));
            root.right.before = root;
            makeTree(root.right, start);
        }
    }
}
