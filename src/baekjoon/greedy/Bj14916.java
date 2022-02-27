package baekjoon.greedy;

import java.io.*;

public class Bj14916 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());

            if (n == 1 || n == 3) {
                bw.write(-1 + "");
            } else {
                int count = n / 5;
                n %= 5;
                if (n % 2 == 0) {
                    count += n / 2;
                } else {
                    count--;
                    n += 5;
                    count += n / 2;
                }

                bw.write(count + "");
            }
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
