package main.level0;

public class 특정_문자_제거하기 {
    public static void main(String[] args) {
        System.out.println(solution("BCBdbe", "B"));
    }

    private static String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}
