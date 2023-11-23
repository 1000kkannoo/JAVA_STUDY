import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_15657 {
    private static int n;
    private static int m;
    private static int[] answer;
    private static int[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);
        answer = new int[m];
        arr = new int[n];

        int i = 0;
        for (String s : br.readLine().split(" ")) {
            arr[i++] = Integer.parseInt(s);
        }

        Arrays.sort(arr);

        DFS(0, 0);
    }

    private static void DFS(int index, int k) {
        if (index == m) {
            for (int i : answer) {
                System.out.print(i + " ");
            }
            System.out.println();
        } else {
            for (int i = k; i < n; i++) {
                answer[index++] = arr[i];
                DFS(index, i);
                index--;
            }
        }
    }
}
