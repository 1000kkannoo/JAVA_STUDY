package main.level0;

import java.util.Arrays;

public class 가장_큰_수 {
    public static void main(String[] args) {
        String answer = solution(new int[]{6, 10, 2});
        System.out.println(answer);
    }

    private static String solution(int[] numbers) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(strArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (strArr[0].startsWith("0")) {
            return "0";
        }

        for (String numStr : strArr) {
            sb.append(numStr);
        }

        return sb.toString();
    }
}
