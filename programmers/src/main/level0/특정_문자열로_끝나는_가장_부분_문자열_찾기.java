package main.level0;

public class 특정_문자열로_끝나는_가장_부분_문자열_찾기 {
    public static void main(String[] args) {
        System.out.println(solution("AbCdEFG", "dE"));
    }

    public static String solution(String myString, String pat) {
        String answer = "";
        int i = myString.lastIndexOf(pat);
        int num = i + (pat.length());
        return myString.substring(0, num);
    }
}
