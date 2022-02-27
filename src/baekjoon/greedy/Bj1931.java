package baekjoon.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Bj1931 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            int[][] arr = new int[n][2];
            for (int i = 0; i < arr.length; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 2; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            Arrays.sort(arr, (o1, o2) -> {
                if (o1[1] - o2[1] == 0) {
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            });

//            for (int[] ints : arr) {
//                System.out.println(Arrays.toString(ints));
//            }

            int count = 0;
            int last = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][0] >= last) {
                    System.out.println("Arrays.toString(arr[i]) = " + Arrays.toString(arr[i]));
                    count++;
                    last = arr[i][1];
                }
            }
            bw.write(count + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
