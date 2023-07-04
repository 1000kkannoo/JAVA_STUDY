import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q_1547 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[4]; // [0,1,2,3]
        int n = Integer.parseInt(br.readLine());
        arr[1] = 1;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (arr[a] == 1 || arr[b] == 1) {
                int temp = arr[b];
                arr[b] = arr[a];
                arr[a] = temp;
            }
        }

        for (int i = 1; i < 4; i++) if (arr[i] == 1) System.out.println(i);
    }
}
