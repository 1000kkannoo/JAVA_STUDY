import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_30792 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int answer = 0;
        for (int i : arr) {
            if (arr[i] < m) {
                break;
            }
            answer++;
        }

        System.out.println(answer);
    }
}
