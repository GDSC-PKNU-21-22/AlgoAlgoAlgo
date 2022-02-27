package ndb.dfsbfs;

import java.io.*;
import java.util.StringTokenizer;

public class Practice1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            String[][] arr = new String[n][m];
            for (int i = 0; i < n; i++) {
                arr[i] =  br.readLine().split("");
            }

            boolean[][] visited = new boolean[n][m];
            int count = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (!visited[i][j] && arr[i][j].equals("0")) {
                        dfs(i, j, arr, visited);
                        count++;
                    }
                }
            }
            bw.write(count + "");
            bw.flush();


        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    private static void dfs(int i, int j, String[][] arr, boolean[][] visited) {

        if (visited[i][j] || arr[i][j].equals("1")) {
            return;
        }

        visited[i][j] = true;

        if (j + 1 < arr[i].length) {
            dfs(i, j + 1, arr, visited);
        }
        if (j - 1 >= 0) {
            dfs(i, j - 1, arr, visited);
        }
        if (i + 1 < arr.length) {
            dfs(i + 1, j, arr, visited);
        }
        if (i - 1 >= 0) {
            dfs(i - 1, j, arr, visited);
        }

    }


}
