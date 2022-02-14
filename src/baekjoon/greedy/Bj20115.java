package baekjoon.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj20115 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            double result = arr[n - 1];
            for (int i = arr.length - 2; i >= 0; i--) {
                result += (double) arr[i] / 2;
            }

            bw.write(result + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
