package main.level0;

public class 삼육구게임 {
    public static void main(String[] args) {
        System.out.println(solution(29423));
    }

    public static int solution(int order) {
        int answer = 0;
        String numStr = Integer.toString(order);
        for (String s : numStr.split("")) {
            if (s.equals("3") || s.equals("6") || s.equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}
