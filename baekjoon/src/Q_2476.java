import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Q_2476 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxPrize = 0;

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            maxPrize = Math.max(maxPrize, calculatePrize(split));
        }

        System.out.println(maxPrize);
    }

    private static int calculatePrize(String[] dice) {
        Map<String, Integer> countMap = new HashMap<>();

        for (String d : dice) {
            countMap.put(d, countMap.getOrDefault(d, 0) + 1);
        }

        int maxDice = Integer.parseInt(dice[0]);
        for (String d : dice) {
            maxDice = Math.max(maxDice, Integer.parseInt(d));
        }

        if (countMap.size() == 1) {
            return 10000 + maxDice * 1000;
        } else if (countMap.size() == 2) {
            for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == 2) {
                    return 1000 + Integer.parseInt(entry.getKey()) * 100;
                }
            }
        }
        return maxDice * 100;
    }
}
