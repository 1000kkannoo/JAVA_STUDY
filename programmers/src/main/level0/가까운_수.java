package main.level0;

public class 가까운_수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 10, 28}, 20));
    }

    public static int solution(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        for (int i : array) {
            int abs = Math.abs(i - n);
            if (abs < min || (abs == min && i < answer)) {
                min = abs;
                answer = i;
            }
        }
        return answer;
    }
}
