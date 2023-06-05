package main.level0;

public class 문자열안에_문자열 {
    public static void main(String[] args) {
        System.out.println(solution("AbcAbcA", "AAA"));
    }

    private static int solution(String str1, String str2) {
        return (str1.contains(str2)) ? 1 : 2;
    }
}
