package main.level0;

public class 문자열_뒤집기 {
    public static void main(String[] args) {
        System.out.println(solution("bread"));
    }

    private static String solution(String my_string) {
        return new StringBuilder(my_string).reverse().toString();
    }
}
