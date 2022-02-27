package ndb.greedy;

import java.io.*;

public class Real2_2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input = br.readLine();
            int result = input.charAt(0) - '0';
            for (int i = 1; i < input.length(); i++) {
                int cur = input.charAt(i) - '0';
                if (result <= 1 || cur <= 1) {
                    result += cur;
                } else {
                    result *= cur;
                }
            }

            bw.write(result + "");

            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
