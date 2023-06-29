package main.level2;

public class 숫자의_표현 {
    static int count = 0;

    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    private static int solution(int n) {
        for (int i = 1; i <= n / 2; i++) {
            int sum = i;
            int level = i + 1;
            while (sum < n) sum += level++;

            if (sum == n) count++;
        }

        return count + 1;
    }
}
