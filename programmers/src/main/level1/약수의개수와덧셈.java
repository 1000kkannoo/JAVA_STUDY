package main.level1;

public class 약수의개수와덧셈 {

    public static void main(String[] args) {
        System.out.println(solution(13,17));
    }

    public static int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            // 제곱수인 경우 약수의 개수는 홀수임을 이용
            sum += (i % Math.sqrt(i) == 0) ? i * -1 : i;
        }
        return sum;
    }
}
