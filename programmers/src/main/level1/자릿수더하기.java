package main.level1;

public class 자릿수더하기 {

    public static void main(String[] args) {
        System.out.println(solution(123));
    }

    public static int solution(int n) {
        int answer = 0;
        String num = String.valueOf(n);
        for (int i = 0; i < num.length(); i++) {
            answer += num.charAt(i) - '0';
        }
        return answer;
    }
}
