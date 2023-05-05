package level1;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(2));
    }

    public static int solution(int n) {
        boolean[] isPrime = new boolean[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                count++;
                if ((long) i * i > 1000000) {
                    continue;
                }
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return count;
    }
}
