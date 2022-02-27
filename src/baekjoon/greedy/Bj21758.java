package baekjoon.greedy;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj21758 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int i = 0;
            while (st.hasMoreTokens()) {
                arr[i++] = Integer.parseInt(st.nextToken());
            }

            long sum = Arrays.stream(arr).sum();

            long[] toRightTotal = new long[n];
            long[] toLeftTotal = new long[n];
            long tmp = 0;
            for (int j = 0; j < arr.length; j++) {
                tmp += arr[j];
                toRightTotal[j] = tmp;
            }
            tmp = 0;
            for (int j = n-1; j >= 0; j--) {
                tmp += arr[j];
                toLeftTotal[j] = tmp;
            }

            long case1Max = -1;
            for (int j = 1; j < n - 1; j++) {
                long temp = (sum - arr[0] - arr[j]) + (sum - toRightTotal[j]);

                if (temp > case1Max) {
                    case1Max = temp;
                }
            }

            long case2Max = -1;
            for (int j = n - 2; j >= 1; j--) {
                long temp = (sum - arr[n - 1] - arr[j]) + (sum - toLeftTotal[j]);

                if (temp > case2Max) {
                    case2Max = temp;
                }
            }

            long max = Math.max(case1Max, case2Max);


            // 벌통 위치가 변할 때
            for (int j = 1; j < n - 1; j++) {
                long temp = (toRightTotal[j] - arr[0]) + (toLeftTotal[j] - arr[n - 1]);
                if (temp > max) {
                    max = temp;
                }
            }

            bw.write(max + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
