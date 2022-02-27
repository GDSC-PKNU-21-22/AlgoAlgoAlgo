package ndb.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Real1 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int result = 0; // 총 그룹 수
            int count = 0; // 현재 그룹에 포함된 모험가의 수

            for (int i = 0; i < n; i++) {
                count++;
                if (count >= arr[i]) {
                    result++;
                    count = 0;
                }
            }

            bw.write(result + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
