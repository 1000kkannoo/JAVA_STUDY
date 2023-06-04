package main.level0;

public class 마지막_두_원소 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 6}));
    }

    private static int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < answer.length; i++) {
            if (i >= num_list.length) {
                answer[i] = getLastIndexValue(num_list);
                break;
            }
            answer[i] = num_list[i];
        }

        return answer;
    }

    private static int getLastIndexValue(int[] num_list) {
        return (num_list[num_list.length - 1] > num_list[num_list.length - 2]) ?
                num_list[num_list.length - 1] - num_list[num_list.length - 2] :
                num_list[num_list.length - 1] * 2;
    }
}
