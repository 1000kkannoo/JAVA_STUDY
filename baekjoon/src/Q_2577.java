import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2577 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String result = String.valueOf(A * B * C);
        int[] answer = new int[10];
        for (char ch : result.toCharArray()) answer[ch - '0']++;

        for (int i : answer) System.out.println(i);
    }
}
