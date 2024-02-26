package main.level0;

public class 일로_만들기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{12, 4, 15, 1, 14}));
    }

    public static int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            while (num != 1) {
                answer++;
                if (num % 2 == 0) {
                    num /= 2;
                } else {
                    num = (num - 1) / 2;
                }
            }
        }
        return answer;
    }
}
