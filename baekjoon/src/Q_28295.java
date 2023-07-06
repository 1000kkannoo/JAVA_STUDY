import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_28295 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = {"N", "E", "S", "W"};
        int point = 0;
        int T = 10;
        while (T-- > 0) {
            int call = Integer.parseInt(br.readLine());
            if (call == 1) point = (point + 1) % 4;
            else if (call == 2) point = (point + 2) % 4;
            else point = (point + 3) % 4;
        }

        System.out.println(arr[point]);
    }
}
