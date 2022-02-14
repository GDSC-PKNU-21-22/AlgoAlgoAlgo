package baekjoon.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj11508 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }

            Arrays.sort(arr);

            long sum = 0;
            // 10, 9, 4, 2, 6, 4, 3
            // 10 9 6 4 4 3 2 -> (10 9 6), (4 4 3), (2)
            for (int i = n - 1; i >= 2; i -= 3) {
                sum += arr[i] + arr[i - 1];
            }

            int k = n % 3;
            for (int i = 0; i < k; i++) {
                sum += arr[i];
            }

            bw.write(sum + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
