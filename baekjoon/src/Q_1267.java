import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());

        int Y = 0;
        int M = 0;
        for (int val : arr) {
            // 영식 요금제
            if (val <= 29) Y += 10;
            else Y += 10 * ((val / 30) + 1);
            // 민식 요금제
            if (val <= 59) M += 15;
            else M += 15 * ((val / 60) + 1);
        }

        if (M == Y) System.out.println("Y M " + Y);
        else if (M < Y) System.out.println("M " + M);
        else System.out.println("Y " + Y);
    }
}
