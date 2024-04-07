package ch4_map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class 모든_아나그램_찾기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String word = br.readLine();
        System.out.println(solution(str, word));
    }

    private static int solution(String str, String word) {
        int answer = 0;
        Map<Character, Integer> wordMap = getWordMap(word);
        Map<Character, Integer> map = new HashMap<>();

        char[] arr = str.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        if (wordMap.equals(map)) {
            answer++;
        }

        for (int i = word.length(); i < arr.length; i++) {
            if (map.get(arr[i - word.length()]) == 1) {
                map.remove(arr[i - word.length()]);
            } else {
                map.put(arr[i - word.length()], map.get(arr[i - word.length()]) - 1);
            }

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            if (wordMap.equals(map)) {
                answer++;
            }
        }

        return answer;
    }

    private static Map<Character, Integer> getWordMap(String word) {
        Map<Character, Integer> map = new HashMap<>();
        char[] wordArr = word.toCharArray();
        for (char c : wordArr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }
}
