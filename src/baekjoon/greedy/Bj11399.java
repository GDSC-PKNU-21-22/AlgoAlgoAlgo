package baekjoon.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bj11399 {
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

            int[] sum = new int[n];
            int result = 0;
            for (int i = 0; i < sum.length; i++) {
                sum[i] = (i > 0 ? sum[i - 1] : 0) + arr[i];
                result += sum[i];
            }

//            System.out.println("Arrays.toString() = " + Arrays.toString(sum));
//            System.out.println("result = " + result);

            bw.write(result + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
