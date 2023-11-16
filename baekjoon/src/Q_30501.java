import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_30501 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        for (String s : arr) {
            findByMonster(s);
        }
    }

    private static void findByMonster(String s) {
        for (char ch : s.toCharArray()) {
            if (ch == 'S') {
                System.out.println(s);
                break;
            }
        }
    }
}
