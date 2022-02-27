package ndb.dfsbfs;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice2_2 {
    static int[][] depth;
    public static void bfs (String[][] arr, int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{x, y});

        int[] offsetX = {1, -1, 0, 0};
        int[] offsetY = {0, 0, 1, -1};
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            x = cur[0];
            y = cur[1];

            for (int k = 0; k < 4; k++) {
                int nx = x + offsetX[k];
                int ny = y + offsetY[k];
                if (nx >= arr.length || nx < 0 || ny >= arr[0].length || ny < 0) {
                    continue;
                }
                if (arr[nx][ny].equals("0")) {
                    continue;
                }

                if (nx == 0 && ny == 0) {
                    continue;
                }

                if (depth[nx][ny] == 0) {

                    q.offer(new int[]{nx, ny});
                    depth[nx][ny] = depth[x][y] + 1;
                }

            }
        }
    }
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

            depth = new int[n][m];
            bfs(arr, 0, 0);

            bw.write((depth[n - 1][m - 1] + 1) + "");
            bw.flush();


        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

}
