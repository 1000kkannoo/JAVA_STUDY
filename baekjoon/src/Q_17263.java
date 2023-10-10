import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_17263 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] split = br.readLine().split(" ");

        int result = Arrays.stream(split).mapToInt(Integer::parseInt).max().getAsInt();

        System.out.println(result);
    }
}
