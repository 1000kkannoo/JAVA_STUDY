import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;

public class Q_1755 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        Map<String, Integer> map1 = Map.of("zero", 0, "one", 1, "two", 2, "three", 3, "four", 4, "five", 5, "six", 6, "seven", 7, "eight", 8, "nine", 9);
        Map<Integer, String> map2 = Map.of(0, "zero", 1, "one", 2, "two", 3, "three", 4, "four", 5, "five", 6, "six", 7, "seven", 8, "eight", 9, "nine");

        int n = Integer.parseInt(split[0]);
        int m = Integer.parseInt(split[1]);

        String[] arr = new String[m - n + 1];
        for (int i = n, j = 0; i <= m; i++, j++) {
            if (i / 10 > 0) {
                String str = String.valueOf(i);
                arr[j] = map2.get(str.charAt(0) - '0') + " " + map2.get(str.charAt(1) - '0');
            } else arr[j] = map2.get(i);
        }

        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (String s : arr) {
            count++;
            String[] split1 = s.split(" ");
            if (split1.length > 1) {
                String str1 = split1[0];
                String str2 = split1[1];
                sb.append(map1.get(str1) * 10 + map1.get(str2)).append(" ");
            } else sb.append(map1.get(s)).append(" ");

            if (count == 10) {
                sb.append("\n");
                count = 0;
            }
        }

        System.out.println(sb);
    }
}
