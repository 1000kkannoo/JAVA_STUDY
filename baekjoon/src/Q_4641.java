import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q_4641 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("-1")) break;

            int sum = 0;
            String[] split = s.split(" ");
            Set<String> collect = new HashSet<>(Arrays.asList(split));
            for (String str : split) {
                if (!str.equals("0")) {
                    String doubleStr = String.valueOf(Integer.parseInt(str) * 2);
                    if (collect.contains(doubleStr)) {
                        sum++;
                    }
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
