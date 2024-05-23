import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q_2776 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int note1Size = Integer.parseInt(br.readLine());
            int[] note1 = new int[note1Size];
            StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < note1Size; i++) {
                note1[i] = Integer.parseInt(st1.nextToken());
            }

            int note2Size = Integer.parseInt(br.readLine());
            int[] note2 = new int[note2Size];
            StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
            for (int i = 0; i < note2Size; i++) {
                note2[i] = Integer.parseInt(st2.nextToken());
            }

            System.out.print(solution(note1, note2));
        }
    }

    private static String solution(int[] note1, int[] note2) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(note1);

        for (int n : note2) {
            if (Arrays.binarySearch(note1, n) < 0) sb.append(0).append("\n");
            else sb.append(1).append("\n");
        }

        return sb.toString();
    }
}
