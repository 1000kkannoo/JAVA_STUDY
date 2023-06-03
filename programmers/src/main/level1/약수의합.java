package main.level1;

public class 약수의합 {
    public static void main(String[] args) {
        System.out.println(solution(12));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n / 2; i++) { // 절반까지 돌리고
            if (n % i == 0) {
                answer += i;
            }
        }
        return answer + n; // 넘어온 수를 더해줌
    }
}
