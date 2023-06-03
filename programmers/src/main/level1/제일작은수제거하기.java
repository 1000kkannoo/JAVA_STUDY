package main.level1;

public class 제일작은수제거하기 {

    public static void main(String[] args) {
        System.out.println(solution(new int[]{4, 3, 2, 1}));
    }

    public static int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            min = min > arr[i] ? arr[i] : min;
        }

        int[] answer = new int[arr.length - 1];
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                continue;
            }
            answer[cnt] = arr[i];
            cnt++;
        }

        return answer;
    }
}
