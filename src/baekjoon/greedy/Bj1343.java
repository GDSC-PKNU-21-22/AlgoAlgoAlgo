package baekjoon.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Bj1343 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, ".*");
            StringTokenizer st2 = new StringTokenizer(input, "X*");
            StringBuilder sb = new StringBuilder(input.length());
            if (input.charAt(0) == '.') {
                sb.append(st2.nextToken());
            }
            while (st.hasMoreTokens()) {
                String s = st.nextToken();
                int count_4 = 0;
                int count_2 = 0;
                int n = s.length();
                while (n % 4 != 0) {
                    n -= 2;
                    count_2++;
                    if (n < 2 && n != 0) {
                        bw.write("-1");
                        return;
                    }
                }
                count_4 = n / 4;

                StringBuilder sb2 = new StringBuilder(s.length());
                for (int i = 0; i < count_4; i++) {
                    sb2.append("AAAA");
                }
                for (int i = 0; i < count_2; i++) {
                    sb2.append("BB");
                }

                sb.append(sb2);
                if (st2.hasMoreTokens()) {
                    sb.append(st2.nextToken());
                }
            }
            bw.write(sb.toString());
            bw.flush();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
