import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_9095 {
    static int[] minus = {1, 2, 3};
    static int count;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            count = 0;
            DFS(num);
            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    private static void DFS(int num) {
        if (num == 0) count++;
        else {
            for (int i = 0; i < 3; i++) {
                if (num - minus[i] >= 0) DFS(num - minus[i]);
            }
        }
    }
}
