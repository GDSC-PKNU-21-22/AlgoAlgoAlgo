package level1;

import java.util.Locale;

public class 문자열내p와y개수 {
    public static void main(String[] args) {
        String s = "pPoooyY";
        boolean answer = true;

        s = s.toLowerCase(Locale.ROOT);

        int p = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p') {
                p++;
            } else if (s.charAt(i) == 'y') {
                y++;
            }
        }

        if (p != y) {
            answer = false;
        }
    }
}
