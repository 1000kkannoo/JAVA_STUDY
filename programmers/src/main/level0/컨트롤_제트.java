package main.level0;

public class 컨트롤_제트 {
    public static void main(String[] args) {
        System.out.println(solution("10 20 30 40"));
    }

    public static int solution(String s) {
        int answer = 0;
        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("Z")) {
                answer -= Integer.parseInt(split[i - 1]);
                continue;
            }
            answer += Integer.parseInt(split[i]);
        }

        return answer;
    }
}
