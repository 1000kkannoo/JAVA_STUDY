import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_11023 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        System.out.println(Arrays.stream(split).mapToInt(Integer::parseInt).sum());
    }
}
