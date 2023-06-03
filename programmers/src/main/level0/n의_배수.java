package main.level0;

public class n의_배수 {
    public static void main(String[] args) {
        System.out.println(solution(98,2));
    }

    private static int solution(int num, int n) {
        return (num % n == 0) ? 1 : 0;
    }
}
