package main.level0;

public class 편지 {
    public static void main(String[] args) {
        System.out.println(solution("happy birthday!"));
    }

    private static int solution(String message) {
        return message.length() * 2;
    }
}
