package programmers.level1;

public class 수박수박수박수박수박 {
    public static void main(String[] args) {
        int n = 3;
        String[] arr = {"수", "박"};

        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            sb.append(arr[i % 2]);
        }
        System.out.println(new String(sb));

    }
}
