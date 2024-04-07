package ch4_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 학급_회장 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String vote = br.readLine();

        System.out.println(solution(vote));
    }

    private static Character solution(String vote) {
        Map<Character, Integer> map = new HashMap<>();
        char answer = ' ';
        for (char c : vote.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int maxCount = Integer.MIN_VALUE;
        for (Character key : map.keySet()) {
            Integer count = map.get(key);
            if (count > maxCount) {
                maxCount = count;
                answer = key;
            }
        }

        return answer;
    }
}
