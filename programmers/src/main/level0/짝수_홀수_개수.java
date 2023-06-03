package main.level0;

public class 짝수_홀수_개수 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 3, 4, 5}));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for (int num : num_list) {
            if (num % 2 == 0) {
                answer[0]++;
            } else {
                answer[1]++;
            }
        }
        return answer;
    }
}
