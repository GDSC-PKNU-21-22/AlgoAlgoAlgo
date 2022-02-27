package ndb.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Real5 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {


            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            int[] count = new int[m];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                count[arr[i] - 1]++;
            }

            int total = arr.length * (arr.length - 1) / 2;

            for (int i = 0; i < count.length; i++) {
                if (count[i] > 1) {
                    total -= (count[i] * (count[i] - 1) / 2);
                }
            }

            bw.write(total + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
