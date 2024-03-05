package main.level0;

public class 삼각형의_완성조건_2 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{11, 7}));
    }

    public static int solution(int[] sides) {
        int a = sides[0];
        int b = sides[1];
        int max = Math.max(a, b);

        int sum1 = max - Math.abs(a - b);
        int sum2 = (a + b - 1) - max;

        return sum1 + sum2;
    }
}
