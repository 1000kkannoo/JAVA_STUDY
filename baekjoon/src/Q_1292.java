import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int[] sequence = new int[end];

        int num = 1;
        int index = 0;
        while (index < end) {
            for (int i = 0; i < num; i++) {
                sequence[index++] = num;
                if (index == end) {
                    break;
                }
            }
            num++;
        }

        int sum = 0;
        for (int i = start - 1; i < end; i++) {
            sum += sequence[i];
        }

        System.out.println(sum);
    }
}
