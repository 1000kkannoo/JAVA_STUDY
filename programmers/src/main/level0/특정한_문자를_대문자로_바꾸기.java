package main.level0;

public class 특정한_문자를_대문자로_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("lowercase", "x"));
    }

    private static String solution(String my_string, String alp) {
        return my_string.replace(alp,alp.toUpperCase());
    }
}
