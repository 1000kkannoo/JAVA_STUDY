import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_9076 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int[] arr = new int[5];
            String[] split = br.readLine().split(" ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = Integer.parseInt(split[i]);
            }
            Arrays.sort(arr);
            if (Math.abs(arr[1] - arr[3]) >= 4) {
                sb.append("KIN").append("\n");
            } else {
                sb.append(arr[1] + arr[2] + arr[3]).append("\n");
            }
        }

        System.out.println(sb);
    }
}
