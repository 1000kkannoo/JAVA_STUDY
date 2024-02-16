package main.level0;

public class 간단한_식_계산하기 {
    public static void main(String[] args) {
        String binomial1 = "43 + 12";
        String binomial2 = "0 - 7777";
        String binomial3 = "40000 * 40000";

        System.out.println(solution(binomial1));
        System.out.println(solution(binomial2));
        System.out.println(solution(binomial3));
    }

    public static int solution(String binomial) {
        String[] split = binomial.split(" ");
        String operators = split[1];

        if (operators.equals("+")) {
            return Integer.parseInt(split[0]) + Integer.parseInt(split[2]);
        } else if (operators.equals("-")) {
            return Integer.parseInt(split[0]) - Integer.parseInt(split[2]);
        } else if (operators.equals("*")) {
            return Integer.parseInt(split[0]) * Integer.parseInt(split[2]);
        }

        throw new IllegalArgumentException("잘못된 계산 기호");
    }
}
