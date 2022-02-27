package baekjoon.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj20300 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            long[] arr = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Long.parseLong(st.nextToken());
            }


            // 2개 합의 최소
            // 1 3 8 9
            // 1 2 3 7 9 9 12
            // 2 개의 합들을 최소로 만듦?
            Arrays.sort(arr);
            if (n % 2 != 0) {
                long max = -1;
                for (int i = 0; i < (n - 1) / 2; i++) {
                    long sum = arr[i] + arr[n - 2 - i];
                    if (max < sum) {
                        max = sum;
                    }
                }
                if (max < arr[n - 1]) {
                    max = arr[n - 1];
                }
                bw.write(max + "");
            } else {
                long max = -1;
                for (int i = 0; i < n / 2; i++) {
                    long sum = arr[i] + arr[n - 1 - i];
                    if (max < sum) {
                        max = sum;
                    }
                }
                bw.write(max + "");
            }

            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    private static int findMax(long[] arr) {

        return 0;
    }
}
