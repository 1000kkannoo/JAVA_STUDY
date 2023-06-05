package main.level0;

public class 암호_해독 {
    public static void main(String[] args) {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4));
    }

    private static String solution(String cipher, int code) {
        StringBuilder sb = new StringBuilder();
        for (int i = code; i <= cipher.length(); i += code) {
            sb.append(cipher.charAt(i - 1));
        }
        return sb.toString();
    }
}
