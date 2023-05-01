package level1;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        System.out.println(solution("try hello world"));
    }

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                count = 0;
                sb.append(' ');
            } else {
                sb.append((count % 2 == 0) ? Character.toUpperCase(c) : Character.toLowerCase(c));
                count++;
            }
        }
        return sb.toString();
    }
}
