package ndb.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Real4 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(arr);

            int i = 1;
            while (isPossible(arr, i)) {
                i++;
            }

            bw.write(i + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }

    private static boolean isPossible(int[] arr, int i) {
        // i를 arr로 만들 수 있으면 true
        // 만들 수 없으면 false

        int sum = 0;
        for (int j = arr.length - 1; j >= 0; j--) {
            if (sum + arr[j] <= i) {
                sum += arr[j];
            }

            if (sum == i) {
                return true;
            }
        }
        return false;
    }
}
