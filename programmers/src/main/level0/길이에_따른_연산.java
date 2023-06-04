package main.level0;

public class 길이에_따른_연산 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
    }

    private static int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            for (int num : num_list) {
                answer += num;
            }
        } else {
            answer = 1;
            for (int num : num_list) {
                answer *= num;
            }
        }
        return answer;
    }
}
