package baekjoon.greedy;

import java.io.*;
import java.util.Arrays;

public class Bj2217 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);

            int sum = arr[arr.length - 1];
            // 2 5 8 18 => 18
            // 2 5 8 15 => 16
            // 2 2 2 2 2 2 12 => 14
            // 2 2 2 2 2 6 12 => 14
            // 2 2 2 2 2 8 12 => 16

            for (int i = arr.length - 2; i >= 0; i--) {
                int cnt = arr.length - i;

                if (sum < arr[i] * cnt) {
                    sum = arr[i] * cnt;
                }
            }

            bw.write(sum + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
