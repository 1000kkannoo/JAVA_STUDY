package main.level0;

public class 문자열_계산하기 {
    public static void main(String[] args) {
        System.out.println(solution("10 + 1 - 1"));
    }

    public static int solution(String my_string) {
        String[] split = my_string.split(" ");
        String sign = "+";
        int sum = 0;
        for (String s : split) {
            if (!s.equals("+") && !s.equals("-")) {
                int n = Integer.parseInt(s);
                sum = (sign.equals("+")) ? sum + n : sum - n;
            } else {
                sign = s;
            }
        }

        return sum;
    }
}
