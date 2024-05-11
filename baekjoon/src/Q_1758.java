import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1758 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) arr[i] = Integer.parseInt(br.readLine());
        Arrays.sort(arr);

        long sum = 0;
        int order = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int countTip = order++ - 1;
            int num = arr[i] - countTip;
            if (num > 0) sum += num;
        }

        System.out.println(sum);
    }
}
