package level2;

public class 타겟넘버 {
    public static void main(String[] args) {
        타겟넘버 t = new 타겟넘버();
        int solution = t.solution(new int[]{4, 1, 2, 1}, 4);
        System.out.println("solution = " + solution);

//        solution = t.solution(new int[]{1, 1, 1, 1, 1}, 3);
//        System.out.println("solution = " + solution);
    }

    int count;
    public int solution(int[] numbers, int target) {
        Node root = makeTree(numbers);

        count = 0;
        dfs(root, target);

        return count;
    }

    private void dfs(Node node, int target) {

        if (isLeafNode(node)) {
            if (node.value == target) {
                count++;
            }
            return;
        }

        dfs(node.left, target);
//        System.out.println("node.value = " + node.value);
        dfs(node.right, target);
    }

    private boolean isLeafNode(Node node) {
        return (node.left == null) && (node.right == null);
    }

    private Node makeTree(int[] numbers) {
        Node root = new Node(0);

        makeChild(root, numbers, 0);

        return root;
    }

    private void makeChild(Node root, int[] numbers, int i) {
        if (i == numbers.length) {
            return;
        }
        Node leftNode = new Node(root.value + numbers[i]);
        Node rightNode = new Node(root.value - numbers[i]);

        root.left = leftNode;
        root.right = rightNode;

        makeChild(leftNode, numbers, i + 1);
        makeChild(rightNode, numbers, i + 1);
    }

    class Node {
        int value;

        public Node(int value) {
            this.value = value;
        }

        Node left;
        Node right;
    }
}
