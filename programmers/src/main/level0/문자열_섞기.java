package main.level0;

public class 문자열_섞기 {
    public static void main(String[] args) {
        System.out.println(solution("aaaaa", "bbbbb"));
    }

    public static String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length(); i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        return sb.toString();
    }
}
