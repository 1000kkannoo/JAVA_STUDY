package main.level0;

public class 문자열_뒤의_n글자 {
    public static void main(String[] args) {
        System.out.println(solution("ProgrammerS123", 11));
    }

    private static String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}
