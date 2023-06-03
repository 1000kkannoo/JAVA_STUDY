package main.level1;

public class 부족한금액계산하기 {

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }

    public static long solution(int price, int money, int count) {
        long sumPrice = 0;
        for (int i = 1; i <= count; i++) {
            sumPrice += (long) price * i;
        }
        return ((money - sumPrice) > 0) ? 0 : sumPrice - money;
    }
}
