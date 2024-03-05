package main.level0;

import java.util.Arrays;

public class 진료순서_정하기 {
    public static void main(String[] args) {
        int[] solution = solution(new int[]{3, 76, 24});
        for (int i : solution) {
            System.out.printf("%d ", i);
        }
    }

    public static int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] emergencySort = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(emergencySort);

        for (int i = 0; i < answer.length; i++) {
            answer[i] = emergency.length - Arrays.binarySearch(emergencySort, emergency[i]);
        }

        return answer;
    }
}
