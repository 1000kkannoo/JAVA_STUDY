package main.level0;

public class 피자_나눠_먹기_1 {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    private static int solution(int n) {
        int pizza = 7;
        int answer = 1;
        while (n - pizza > 0) {
            answer++;
            pizza += 7;
        }
        return answer;
    }
}
