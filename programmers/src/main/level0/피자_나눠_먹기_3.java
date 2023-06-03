package main.level0;

public class 피자_나눠_먹기_3 {
    public static void main(String[] args) {
        System.out.println(solution(4, 12));
    }

    private static int solution(int slice, int n) {
        return (n % slice > 0) ? (n / slice) + 1 : n / slice;
    }
}
