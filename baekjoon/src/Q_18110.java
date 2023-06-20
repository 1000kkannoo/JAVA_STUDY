import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        System.out.println(solution(n, arr));
    }

    private static int solution(int n, int[] arr) {
        Arrays.sort(arr);
        double percent = n * ((double) 15 / 100);
        int round = (int) Math.round(percent);

        int sum = 0, count = 0;
        for (int i = round; i < arr.length - round; i++) {
            sum += arr[i];
            count++;
        }

        return (int) Math.round((double) sum / count);
    }
}
