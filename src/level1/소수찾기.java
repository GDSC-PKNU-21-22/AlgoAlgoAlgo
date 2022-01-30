package level1;

public class 소수찾기 {
    public static void main(String[] args) {
        int n = 10;

        int answer = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println("i = " + i);
                answer++;
            }
        }

        System.out.println("answer = " + answer);
    }

    private static boolean isPrime(int i) {
        double sqrt = Math.sqrt(i);
        System.out.println("sqrt = " + sqrt);
        for (int j = 2; j <= sqrt; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
