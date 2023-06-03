package main.level0;

public class 자릿수_더하기 {
    public static void main(String[] args) {
        System.out.println(solution(930211));
    }

    private static int solution(int n) {
        String[] strVal = String.valueOf(n).split("");
        int answer = 0;
        for (String s : strVal) {
            answer += Integer.parseInt(s);
        }
        return answer;
    }
}
