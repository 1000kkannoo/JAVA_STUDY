import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_2953 {
    public static void main(String[] args) throws Exception {
        int[][] arr = new int[5][4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        System.out.println(solution(arr));
    }

    private static String solution(int[][] arr) {
        Map<Integer, Integer> map = getPlayerAndScoreMap(arr);
        return orderByHighestScore(map);
    }

    private static Map<Integer, Integer> getPlayerAndScoreMap(int[][] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            for (int value : arr[i]) {
                map.put(i + 1, map.getOrDefault(i + 1, 0) + value);
            }
        }
        return map;
    }

    private static String orderByHighestScore(Map<Integer, Integer> map) {
        int maxChef = -1;
        int maxScore = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxScore) {
                maxScore = entry.getValue();
                maxChef = entry.getKey();
            }
        }
        return maxChef + " " + maxScore;
    }
}
