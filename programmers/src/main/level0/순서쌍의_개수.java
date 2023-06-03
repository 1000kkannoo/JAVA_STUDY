package main.level0;

public class 순서쌍의_개수 {
    public static void main(String[] args) {
        System.out.println(solution(100));
    }

    private static int solution(int n) {
        int m = 1;
        int answer = 0;
        while (m <= n) {
            answer = (n % m == 0) ? answer + 1 : answer;
            m++;
        }
        return answer;
    }
}
