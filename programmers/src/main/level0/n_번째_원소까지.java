package main.level0;

public class n_번째_원소까지 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 2, 1, 7, 5}, 3));
    }

    private static int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            answer[i] = num_list[i];
        }
        return answer;
    }
}
