package main.level0;

public class 문자열_뒤집기_2 {
    public static void main(String[] args) {
        System.out.println(solution("Progra21Sremm3", 6, 12));
    }

    public static String solution(String my_string, int s, int e) {
        StringBuilder sb = new StringBuilder();
        String[] split = my_string.split("");
        for (int i = s, j = e; i < j; i++, j--) {
            String temp = split[i];
            split[i] = split[j];
            split[j] = temp;
        }

        for (String str : split) {
            sb.append(str);
        }

        return sb.toString();
    }
}
