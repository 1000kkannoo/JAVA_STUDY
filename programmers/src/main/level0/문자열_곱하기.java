package main.level0;

public class 문자열_곱하기 {
    public static void main(String[] args) {
        System.out.println(solution("string", 3));
    }

    private static String solution(String my_string, int k) {
        return my_string.repeat(k);
    }
}
