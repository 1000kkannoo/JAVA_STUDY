package main.level0;

import java.util.HashMap;
import java.util.Map;

public class 문자열_묶기 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "bc", "d", "efg", "hi"}));
    }

    public static int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = Integer.MIN_VALUE;

        for (String s : strArr) {
            int putValue = map.getOrDefault(s.length(), 0) + 1;
            map.put(s.length(), putValue);

            if (putValue > answer) {
                answer = putValue;
            }
        }
        return answer;
    }
}
