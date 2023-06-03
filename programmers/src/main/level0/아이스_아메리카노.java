package main.level0;

public class 아이스_아메리카노 {
    public static void main(String[] args) {
        System.out.println(solution(5500));
    }

    private static int[] solution(int money) {
        return new int[]{money / 5500, money % 5500};
    }
}
