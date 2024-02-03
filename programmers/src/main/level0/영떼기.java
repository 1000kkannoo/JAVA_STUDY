package main.level0;

public class 영떼기 {
    public static void main(String[] args) {
        String s = "0010";
        System.out.println(solution(s));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = s.toCharArray();

        boolean toggle = false;
        for (char c : charArray) {
            if (c != '0') {
                toggle = true;
            }
            if (toggle) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
