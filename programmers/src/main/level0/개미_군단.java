package main.level0;

public class 개미_군단 {
    public static void main(String[] args) {
        System.out.println(solution(23));
    }

    private static int solution(int hp) {
        int army = 0;
        army += hp / 5;
        hp %= 5;

        army += hp / 3;
        hp %= 3;

        return army += hp;
    }
}
