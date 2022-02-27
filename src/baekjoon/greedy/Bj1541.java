package baekjoon.greedy;

import java.io.*;
import java.util.*;

public class Bj1541 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {

            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, "+-");
            StringTokenizer st2 = new StringTokenizer(s, "0123456789");

            Queue<Integer> numQueue = new LinkedList<>();
            Queue<String> opQueue = new LinkedList<>();
            while (st.hasMoreTokens()) {
                numQueue.add(Integer.parseInt(st.nextToken()));
            }

            while (st2.hasMoreTokens()) {
                opQueue.add(st2.nextToken());
            }

            int before = 0;
            int after = 0;
            boolean isMinus = false;
            while (!numQueue.isEmpty()) {
                Integer pop = numQueue.remove();

                if (isMinus) {
                    after += pop;
                } else {
                    before += pop;
                }
                if (!opQueue.isEmpty()) {
                    String remove = opQueue.remove();
                    if (remove.equals("-")) {
                        isMinus = true;
                    }
                }
            }

            bw.write((before - after) + "");

            bw.flush();

        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
