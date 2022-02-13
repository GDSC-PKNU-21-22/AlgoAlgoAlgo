package level3;

import java.util.*;

public class 베스트앨범 {
    public static void main(String[] args) {

        베스트앨범 ba = new 베스트앨범();
        String[] genres = {"classic", "pop", "classic", "classic", "pop", "jazz"};
        int[] plays = {500, 600, 150, 800, 2500, 4000};

        int[] solution = ba.solution(genres, plays);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));

    }

    public int[] solution(String[] genres, int[] plays) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < genres.length; i++) {
            map.put(genres[i], map.get(genres[i]) == null ? plays[i] : map.get(genres[i]) + plays[i]);
        }
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : entries) {
            list.add(entry);
        }
        list.sort((o1, o2) -> o2.getValue() - o1.getValue());

        ArrayList<Integer> arrayList = new ArrayList<>();
        int k = 0;
        for (Map.Entry<String, Integer> entry : list) {
            int max = -1;
            int maxIndex = -1;
            for (int i = 0; i < genres.length; i++) {
                if (entry.getKey().equals(genres[i])) {
                    if (plays[i] > max) {
                        max = plays[i];
                        maxIndex = i;
                    }
                }
            }
            arrayList.add(maxIndex);


            int max2 = -1;
            int maxIndex2 = -1;
            for (int i = 0; i < genres.length; i++) {
                if (entry.getKey().equals(genres[i])) {
                    if (i!=maxIndex && plays[i] > max2) {
                        max2 = plays[i];
                        maxIndex2 = i;
                    }
                }
            }
            if (maxIndex2 != -1) {
                arrayList.add(maxIndex2);
            }
        }

        int[] answer = new int[arrayList.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arrayList.get(i);
        }

        return answer;
    }
}
