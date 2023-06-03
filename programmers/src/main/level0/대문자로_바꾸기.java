package main.level0;

public class 대문자로_바꾸기 {
    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
    }

    private static String solution(String myString) {
        return myString.toUpperCase();
    }
}
