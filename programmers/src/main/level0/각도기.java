package main.level0;

public class 각도기 {
    public static void main(String[] args) {
        System.out.println(solution(91));
    }

    private static int solution(int angle) {
        if (angle <= 90) {
            return (angle == 90) ? 2 : 1;
        }
        return (angle == 180) ? 4 : 3;
    }
}
