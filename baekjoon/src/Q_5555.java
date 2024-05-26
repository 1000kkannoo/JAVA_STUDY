import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5555 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String findStr = br.readLine();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) arr[i] = br.readLine();

        System.out.println(solution(findStr, n, arr));
    }

    private static int solution(String findStr, int n, String[] arr) {
        int count = 0;
        for (String str : arr) {
            String substring = str.substring(0, findStr.length() - 1);
            String result = str + substring;
            if (result.contains(findStr)) count++;
        }
        return count;
    }
}
