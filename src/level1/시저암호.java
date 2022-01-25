package level1;

public class 시저암호 {
    public static void main(String[] args) {

        String s = "a B z";
        int n = 4;

        String answer = "";
        StringBuilder sb = new StringBuilder(s.length());

        for (int i = 0; i < s.length(); i++) {
            char ch = getMovedChar(s.charAt(i), n);

            sb.append(ch);
        }
        System.out.println("new String(sb) = " + new String(sb));

    }

    private static char getMovedChar(char ch, int offset) {
        if (ch == ' ') {
            return ' ';
        }

        return addOffset(ch, offset);
    }

    private static char addOffset(char ch, int offset) {

        if (ch >= 'A' && ch <= 'Z') {
            for (int i = 0; i < offset; i++) {
                ch++;
                if (ch > 'Z') {
                    ch = 'A';
                }
            }
        }
        else if (ch >= 'a' && ch <= 'z') {
            for (int i = 0; i < offset; i++) {
                ch++;
                if (ch > 'z') {
                    ch = 'a';
                }
            }
        }
        return ch;
    }
}
