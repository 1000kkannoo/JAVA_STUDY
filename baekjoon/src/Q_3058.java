import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q_3058 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            String[] split = br.readLine().split(" ");
            List<Integer> list = getIntegerList(split);

            sb.append(getSum(list)).append(" ").append(getMinValue(list)).append("\n");
        }

        System.out.println(sb);
    }

    private static Integer getMinValue(List<Integer> list) {
        return list.stream().findFirst().get();
    }

    private static int getSum(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }

    private static List<Integer> getIntegerList(String[] split) {
        return Arrays.stream(split)
                .map(Integer::parseInt)
                .filter(num -> num % 2 == 0)
                .sorted(Integer::compareTo)
                .collect(Collectors.toList());
    }
}
