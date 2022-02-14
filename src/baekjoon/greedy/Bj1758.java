package baekjoon.greedy;

import java.io.*;
import java.util.Arrays;

public class Bj1758 {
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
            for (int i = n - 1, k = 0; i >= 0; i--, k++) {
                if (arr[i] - k < 0) {
                    break;
                }
                sum += (arr[i] - k);
            }

            bw.write(sum + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
