package main.level0;

public class 배열의_원소만큼_추가하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{5, 1, 4}));
    }

    private static int[] solution(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int[] answer = new int[sum];
        int count = 0;
        for (int i = 0, j = 0; i < answer.length; i++) {
            answer[i] = arr[j];
            count++;
            if (count == arr[j]) {
                count = 0;
                j++;
            }
        }
        return answer;
    }
}
