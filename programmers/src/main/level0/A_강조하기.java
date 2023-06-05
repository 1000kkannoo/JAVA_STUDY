package main.level0;

public class A_강조하기 {
    public static void main(String[] args) {
        System.out.println(solution("PrOgRaMmErS"));
    }

    private static String solution(String myString) {
        return myString.toLowerCase().replace('a','A');
    }
}
