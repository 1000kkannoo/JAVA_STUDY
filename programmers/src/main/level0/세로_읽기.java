package main.level0;

public class 세로_읽기 {
    public static void main(String[] args) {
        System.out.println(solution("ihrhbakrfpndopljhygc", 4, 2));
    }

    public static String solution(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i += m) {
            String split = my_string.substring(i, Math.min(my_string.length(), i + m));
            sb.append(split.charAt(c - 1));
        }

        return sb.toString();
    }
}
