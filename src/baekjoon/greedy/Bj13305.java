package baekjoon.greedy;

import java.io.*;
import java.util.StringTokenizer;

public class Bj13305 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            int n = Integer.parseInt(br.readLine());

            int[] roads = new int[n - 1];
            int[] cities = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < roads.length; i++) {
                roads[i] = Integer.parseInt(st.nextToken());
            }
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < cities.length; i++) {
                cities[i] = Integer.parseInt(st.nextToken());
            }

            long sum = 0;
            int beforePrice = cities[0];
            for (int i = 0; i < roads.length; i++) {
                if (cities[i] < beforePrice) {
                    beforePrice = cities[i];
                }
                sum += (long) beforePrice * roads[i];
            }

            bw.write(sum + "");
            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
