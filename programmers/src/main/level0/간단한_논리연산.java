package main.level0;

public class 간단한_논리연산 {
    public static void main(String[] args) {
        System.out.println(solution(false, true, true, true));
    }

    public static boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean a = calculate(x1, x2);
        boolean b = calculate(x3, x4);

        return a && b;
    }

    public static boolean calculate(boolean a, boolean b) {
        return a || b;
    }
}
