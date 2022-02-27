package programmers.level3;

public class 네트워크 {
    public static void main(String[] args) {
        네트워크 n = new 네트워크();
        int[][] computers = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        int solution = n.solution(3, computers);
        System.out.println("solution = " + solution);
    }

    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                answer++;
                dfs(computers, i);
            }
        }

        return answer;
    }

    private void dfs(int[][] computers, int i) {

        if (visited[i]) {
            return;
        }

        visited[i] = true;
        for (int j = 0; j < computers[i].length; j++) {
            if (computers[i][j] == 1) {
                dfs(computers, j);
            }
        }

    }
}
