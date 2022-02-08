package level1;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        String s = "a234";
        boolean answer = checkLength(s);

        try {

            int i = Integer.parseInt(s);
        } catch (NumberFormatException nfe) {
            answer = false;
        }
    }
    public static boolean checkLength(String s) {
        if (s.length() == 4) {
            return true;
        }
        if (s.length() == 6) {
            return true;
        }
        return false;
    }
}
