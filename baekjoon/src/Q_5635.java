import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Q_5635 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<String, LocalDate> map = new HashMap<>();
        int num = Integer.parseInt(br.readLine());
        while (num --> 0) {
            putNameAndLocalDate(br, map);
        }

        System.out.println(solution(map));
    }

    private static void putNameAndLocalDate(BufferedReader br, Map<String, LocalDate> map) throws IOException {
        String[] split = br.readLine().split(" ");
        int year = Integer.parseInt(split[3]);
        int month = Integer.parseInt(split[2]);
        int dayOfMonth = Integer.parseInt(split[1]);
        map.put(split[0], LocalDate.of(year, month, dayOfMonth));
    }

    private static String solution(Map<String, LocalDate> map) {
        StringBuilder sb = new StringBuilder();

        List<Map.Entry<String, LocalDate>> collect = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        return sb.append(collect.get(collect.size() - 1).getKey()).append("\n").append(collect.get(0).getKey())
                .toString();
    }
}
