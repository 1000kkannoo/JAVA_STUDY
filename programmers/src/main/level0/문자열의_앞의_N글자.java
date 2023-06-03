package main.level0;

public class 문자열의_앞의_N글자 {
    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
    }

    private static String solution(String my_string, int n) {
        return my_string.substring(0,n);
    }
}
