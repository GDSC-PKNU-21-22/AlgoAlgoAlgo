package level1;

public class 약수의합 {
    public static void main(String[] args) {
        int answer = 0;

        int n = 12;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                answer += i;
            }
        }
        System.out.println("answer = " + answer);
    }
}
