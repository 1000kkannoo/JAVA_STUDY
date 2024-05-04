import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1431 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, (s1, s2) -> {
            if (s1.length() == s2.length()) {
                int s1Num = 0, s2Num = 0;
                char[] s1Arr = s1.toCharArray(), s2Arr = s2.toCharArray();
                for (int i = 0; i < s1.length(); i++) {
                    if (Character.isDigit(s1Arr[i])) s1Num += s1Arr[i] - '0';
                    if (Character.isDigit(s2Arr[i])) s2Num += s2Arr[i] - '0';
                }

                if (s1Num == s2Num) {
                    return s1.compareTo(s2);
                }

                return s1Num - s2Num;
            }
            return s1.length() - s2.length();
        });

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append("\n");
        }
        System.out.println(sb);
    }
}
