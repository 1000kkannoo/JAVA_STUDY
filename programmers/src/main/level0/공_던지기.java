package main.level0;

public class 공_던지기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5, 6}, 5));
    }

    public static int solution(int[] numbers, int k) {
        int answer = 0;
        int i = 0;
        while (k-- > 0) {
            if (i >= numbers.length) {
                i = i - numbers.length;
            }
            answer = numbers[i];
            i += 2;
        }
        return answer;
    }
}
