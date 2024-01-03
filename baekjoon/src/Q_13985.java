import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q_13985 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = "NO";
        List<Integer> list = new ArrayList<>();

        String[] split = br.readLine().split(" ");
        for (String s : split) {
            try {
                int n = Integer.parseInt(s);
                list.add(n);
            } catch (NumberFormatException ignored) {

            }
        }

        int sum = list.get(0) + list.get(1);
        int result = list.get(2);
        if (sum == result) {
            answer = "YES";
        }
        System.out.println(answer);
    }
}
