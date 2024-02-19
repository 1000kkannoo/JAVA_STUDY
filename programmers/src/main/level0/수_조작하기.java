package main.level0;

public class 수_조작하기 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};
        System.out.println(solution(numLog));
    }

    public static String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < numLog.length - 1; i++) {
            int result = numLog[i + 1] - numLog[i];
            if (result == 1) {
                answer.append("w");
            } else if (result == -1) {
                answer.append("s");
            } else if (result == 10) {
                answer.append("d");
            } else if (result == -10) {
                answer.append("a");
            }
        }

        return answer.toString();
    }
}
