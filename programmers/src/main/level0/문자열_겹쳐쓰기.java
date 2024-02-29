package main.level0;

public class 문자열_겹쳐쓰기 {
    public static void main(String[] args) {
        System.out.println(solution("He11oWor1d", "lloWorl", 2));
    }

    public static String solution(String my_string, String overwrite_string, int s) {
        String substring = my_string.substring(0, s);
        String substring1 = my_string.substring(s + overwrite_string.length());
        return substring + overwrite_string + substring1;
    }
}
