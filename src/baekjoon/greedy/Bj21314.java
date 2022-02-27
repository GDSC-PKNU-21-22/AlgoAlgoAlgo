package baekjoon.greedy;

import java.io.*;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Bj21314 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String input = br.readLine();

            String high = "";
            BigInteger bi = BigInteger.ZERO;
            long cur = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);

                if (c == 'M') {
                    if (bi.equals(BigInteger.ZERO)) {
                        bi = BigInteger.ONE;
                    } else {
                        bi = bi.multiply(BigInteger.TEN);
                    }
                } else {
                    if (bi.equals(BigInteger.ZERO)) {
                        bi = BigInteger.valueOf(5);
                    } else {
                        bi = bi.multiply(BigInteger.valueOf(50));
                    }
                    high += bi.toString();
                    bi = BigInteger.ZERO;
                }
            }
            if (!bi.equals(BigInteger.ZERO)) {
                String s = bi.toString();
                String replace = s.replace('0', '1');
                high += replace;
            }


            String low = "";

            bi = BigInteger.ZERO;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == 'M') {
                    if (bi.equals(BigInteger.ZERO)) {
                        bi = BigInteger.ONE;
                    } else {
                        bi = bi.multiply(BigInteger.TEN);
                    }
                } else {
                    if (!bi.equals(BigInteger.ZERO)) {
                        low += bi.toString();
                    }
                    low += 5;
                    bi = BigInteger.ZERO;
                }
            }
            if (!bi.equals(BigInteger.ZERO)) {
                String s = bi.toString();
                low += s;
            }


            bw.write(high);
            bw.newLine();
            bw.write(low);

            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
