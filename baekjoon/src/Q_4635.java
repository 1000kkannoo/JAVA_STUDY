import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_4635 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            int sum = 0;
            int distance = 0;
            for (int i = 0; i < n; i++) {
                String[] split = br.readLine().split(" ");
                int speed = Integer.parseInt(split[0]);
                int inputDistance = Integer.parseInt(split[1]);

                distance = inputDistance - distance;
                int totalDistance = speed * distance;

                distance = inputDistance;
                sum += totalDistance;
            }
            sb.append(sum).append(" miles").append("\n");
        }

        System.out.println(sb);
    }
}
