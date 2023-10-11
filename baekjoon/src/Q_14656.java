import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_14656 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()), i = 0;
        int[] arr = new int[n];
        for (String s : br.readLine().split(" ")) {
            arr[i++] = Integer.parseInt(s);
        }

        int answer = 0;
        for (int j = 1, k = 0; j <= n; j++, k++) {
            if (arr[k] != j) answer++;
        }

        System.out.println(answer);
    }
}
