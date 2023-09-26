import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_10808 {
    public static void main(String[] args) throws Exception {
        int[] arr = solution();
        for (int count : arr) {
            System.out.printf("%s ", count);
        }
    }

    private static int[] solution() throws IOException {
        int[] arr = new int[26]; // 0 ~ 25
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        for (char ch : word.toCharArray()) { // 97 ~ 122
            arr[ch - 97]++;
        }
        return arr;
    }
}
