package main.level0;

public class 삼각형의_완성조건_1 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{199, 72, 222}));
    }

    private static int solution(int[] sides) {
        int max = Math.max(Math.max(sides[0], sides[1]), sides[2]);

        if (max == sides[0]) {
            checkTriangle(sides[1], sides[2], sides[0]);
        }
        return (max == sides[1]) ?
                checkTriangle(sides[0], sides[2], sides[1]) :
                checkTriangle(sides[0], sides[1], sides[2]);
    }

    public static int checkTriangle(int a, int b, int c) {
        return ((a + b) <= c) ? 2 : 1;
    }
}
