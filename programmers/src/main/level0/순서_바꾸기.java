package main.level0;

public class 순서_바꾸기 {
    public static void main(String[] args) {
        for (int num : solution(new int[]{2, 1, 6}, 1)) {
            System.out.println(num);
        }
    }

    public static int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        int j = 0;
        for (int i = n; i < num_list.length; i++) {
            answer[j++] = num_list[i];
        }

        for (int i = 0; i < n; i++) {
            answer[j++] = num_list[i];
        }

        return answer;
    }
}
