import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Q_2592 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> countMap = new HashMap<>();

        System.out.println(getAvg(br, countMap));
        System.out.println(getResult(countMap));
    }

    private static Integer getResult(Map<Integer, Integer> countMap) {
        return countMap.entrySet().stream()
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElseThrow(() -> new IllegalArgumentException("잘못된 값"));
    }

    private static int getAvg(BufferedReader br, Map<Integer, Integer> countMap) throws IOException {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        return sum / 10;
    }
}
