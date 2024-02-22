package main.level0;

public class 피자_나눠_먹기_2 {
    public static void main(String[] args) {
        System.out.println(solution(10));
    }

    public static int solution(int n) {
        int pizza = 1;
        while (true) {
            if ((6 * pizza) % n == 0) {
                return pizza;
            }
            pizza++;
        }
    }
}
