package baekjoon.greedy;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj1439 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String s = br.readLine();

            int countOne = 0;
            char before = ' ';
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (before == c) {
                    continue;
                }

                if (c == '1') {
                    countOne++;
                }
                before = c;

            }

            int countZero = 0;
            before = ' ';
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (before == c) {
                    continue;
                }

                if (c == '0') {
                    countZero++;
                }
                before = c;
            }

            bw.write(Math.min(countOne, countZero) + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
