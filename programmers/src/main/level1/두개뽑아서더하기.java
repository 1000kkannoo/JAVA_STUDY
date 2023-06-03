package main.level1;

import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 3, 4, 1}));
    }

    public static int[] solution(int[] numbers) {
        Set<Integer> answerSet = new HashSet<>();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answerSet.add(numbers[i] + numbers[j]);
            }
        }

        return answerSet.stream().sorted(Integer::compareTo).mapToInt(Integer::intValue).toArray();
    }
}
