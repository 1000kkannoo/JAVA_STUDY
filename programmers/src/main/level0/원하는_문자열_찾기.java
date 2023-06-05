package main.level0;

public class 원하는_문자열_찾기 {
    public static void main(String[] args) {
        System.out.println(solution("aaAA", "aaaaa"));
    }

    private static int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }
}
