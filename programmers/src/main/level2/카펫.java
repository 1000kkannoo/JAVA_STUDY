package main.level2;

public class 카펫 {
    public static void main(String[] args) {
        System.out.println(solution(10, 2));
    }

    public static int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] answer = new int[2];

        for (int i = total; i >= 3; i--) {
            if (total % i == 0) {
                int j = total / i;
                if ((i - 2) * (j - 2) == yellow) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }
        return answer;
    }
}
