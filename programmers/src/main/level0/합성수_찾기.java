package main.level0;

public class 합성수_찾기 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
