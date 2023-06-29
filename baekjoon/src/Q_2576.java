import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q_2576 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> arr = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 2 != 0) {
                sum += n;
                arr.add(n);
            }
        }

        Collections.sort(arr);

        if (!arr.isEmpty()) sb.append(sum).append("\n").append(arr.get(0));
        else sb.append(-1);

        System.out.println(sb);
    }
}
