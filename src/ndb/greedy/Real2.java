package ndb.greedy;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Real2 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int input = Integer.parseInt(br.readLine());
            int count = 0;
            int tmp = input;
            while (tmp != 0) {
                tmp /= 10;
                count++;
            }

            int pow = (int) Math.pow(10, count - 1);

            tmp = input;
            int sum = 0;
            for (int i = 0; i < count; i++, pow /= 10) {
                if (i == 0) {
                    sum = tmp / pow;
                } else {
                    if (i == 1) {
                        if (sum == 0 || sum == 1) {
                            sum += tmp / pow;
                        } else {
                            sum *= (tmp / pow);
                        }
                    } else {
                        if (tmp / pow == 1 || tmp / pow == 0) {
                            sum += tmp / pow;
                        } else {
                            sum *= tmp / pow;
                        }
                    }
                }

                tmp = tmp - (tmp / pow) * pow;
            }

            bw.write(sum + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
