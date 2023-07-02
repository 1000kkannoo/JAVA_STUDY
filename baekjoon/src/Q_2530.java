import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
import java.util.StringTokenizer;

public class Q_2530 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());
        int second = Integer.parseInt(st.nextToken());
        int after = Integer.parseInt(br.readLine());

        LocalTime time = LocalTime.of(hour, minute, second).plusSeconds(after);
        String[] split = time.toString().split(":");

        int[] arr = new int[3];
        for (int i = 0; i < split.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        for (int answer : arr) sb.append(answer).append(" ");
        System.out.println(sb);
    }
}
