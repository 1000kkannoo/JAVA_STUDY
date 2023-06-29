import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int minGcd = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int value = arr[i + 1] - arr[i];
            minGcd = GCD(value, minGcd);
        }

        System.out.println(((arr[arr.length - 1] - arr[0]) / minGcd + 1) - (arr.length));
    }

    public static int GCD(int max, int min) {
        if (min == 0) return max;
        else return GCD(min, max % min);
    }
}
