package main.level0;

public class n개_간격의_원소들 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 2, 6, 1, 7, 6}, 2));
    }

    private static int[] solution(int[] num_list, int n) {
        int[] answer = new int[1 + ((num_list.length - 1) / n)];
        for (int i = 0, index = 0; i < num_list.length; i += n, index++) {
            answer[index] = num_list[i];
        }
        return answer;
    }
}
