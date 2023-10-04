import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q_1427 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split("");

        Arrays.stream(split)
                .sorted(Comparator.comparingInt(Integer::parseInt))
                .sorted(Comparator.reverseOrder())
                .forEach(sb::append);

        System.out.println(sb);
    }
}
