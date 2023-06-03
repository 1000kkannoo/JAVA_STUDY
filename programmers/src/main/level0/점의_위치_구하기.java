package main.level0;

public class 점의_위치_구하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{-3, 2}));
    }

    private static int solution(int[] dot) {
        if (dot[0] > 0) {
            return (dot[1] > 0) ? 1 : 4;
        } else {
            return (dot[1] > 0) ? 2 : 3;
        }
    }
}
