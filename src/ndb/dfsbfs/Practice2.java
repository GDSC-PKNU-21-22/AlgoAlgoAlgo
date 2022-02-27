package ndb.dfsbfs;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Practice2 {
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

            // bfs
            boolean[][] visited = new boolean[n][m];
            int[][] backI = new int[n][m];
            int[][] backJ = new int[n][m];

            Queue<int[]> q = new LinkedList<>();
            q.offer(new int[]{0, 0});


            while (!q.isEmpty()) {
                int[] cur = q.poll();

                visited[cur[0]][cur[1]] = true;
                if (cur[0] == n - 1 && cur[1] == m - 1) {
                    break;
                }

                if (cur[1] + 1 < m && !visited[cur[0]][cur[1] + 1]) {
                    if (arr[cur[0]][cur[1] + 1].equals("1")) {
                        q.offer(new int[]{cur[0], cur[1] + 1});
                        backI[cur[0]][cur[1] + 1] = cur[0];
                        backJ[cur[0]][cur[1] + 1] = cur[1];
                        visited[cur[0]][cur[1] + 1] = true;
                    }
                }
                if (cur[1] - 1 >= 0 && !visited[cur[0]][cur[1] - 1]) {
                    if (arr[cur[0]][cur[1] - 1].equals("1")) {
                        q.offer(new int[]{cur[0], cur[1] - 1});
                        backI[cur[0]][cur[1] - 1] = cur[0];
                        backJ[cur[0]][cur[1] - 1] = cur[1];
                        visited[cur[0]][cur[1] - 1] = true;
                    }
                }
                if (cur[0] + 1 < n && !visited[cur[0] + 1][cur[1]]) {
                    if (arr[cur[0] + 1][cur[1]].equals("1")) {
                        q.offer(new int[]{cur[0] + 1, cur[1]});
                        backI[cur[0] + 1][cur[1]] = cur[0];
                        backJ[cur[0] + 1][cur[1]] = cur[1];
                        visited[cur[0] + 1][cur[1]] = true;
                    }
                }
                if (cur[0] - 1 >= 0 && !visited[cur[0] - 1][cur[1]]) {
                    if (arr[cur[0] - 1][cur[1]].equals("1")) {
                        q.offer(new int[]{cur[0] - 1, cur[1]});
                        backI[cur[0] - 1][cur[1]] = cur[0];
                        backJ[cur[0] - 1][cur[1]] = cur[1];
                        visited[cur[0] - 1][cur[1]] = true;
                    }
                }
            }
            int i = n - 1;
            int j = m - 1;
            int count = 0;
            while (i > 0 || j > 0) {
                int tmpI = i;
                int tmpJ = j;
                count++;
                i = backI[tmpI][tmpJ];
                j = backJ[tmpI][tmpJ];

            }

            bw.write((count + 1) + "");
            bw.flush();


        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

}
