import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_1453 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[101];
        int num = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        int answer = 0;
        for (String s : split) {
            if (arr[Integer.parseInt(s)] == 0) {
                arr[Integer.parseInt(s)] = 1;
            } else if (arr[Integer.parseInt(s)] == 1) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}
