package main.level0;

public class 숨어있는_숫자의_덧셈_2 {
    public static void main(String[] args) {
        System.out.println(solution("aAb1B2cC34oOp"));
    }

    public static int solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = my_string.toCharArray();
        for (char c : charArray) {
            if (Character.isAlphabetic(c)) {
                sb.append("a");
            } else {
                sb.append(c);
            }
        }

        String[] intString = sb.toString().split("a");

        int answer = 0;

        for (String s : intString) {
            if (!s.equals("")) {
                answer += Integer.parseInt(s);
            }
        }

        return answer;
    }
}
