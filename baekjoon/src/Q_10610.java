import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Q_10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        Character[] arr = new Character[num.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = num.charAt(i);
        }

        Arrays.sort(arr, Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (char ch : arr) {
            int n = ch - '0';
            sum += n;
            sb.append(n);
        }

        if(arr[arr.length - 1] != '0' || sum % 3 != 0) {
            System.out.println(-1);
        } else {
            System.out.println(sb);
        }
    }
}
