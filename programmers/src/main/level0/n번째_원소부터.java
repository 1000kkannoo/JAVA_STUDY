package main.level0;

public class n번째_원소부터 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 2, 1, 7, 5}, 2));
    }

    private static int[] solution(int[] num_list, int n) {
        int[] answer = new int[(num_list.length - n) + 1];
        for (int i = n - 1, j = 0; i < num_list.length; i++, j++) {
            answer[j] = num_list[i];
        }
        return answer;
    }
}
