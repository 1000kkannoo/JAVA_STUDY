import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();

        int[] arr = new int[10];

        for (char ch : number.toCharArray()) {
            if (ch - '0' == 6) {
                if (arr[6] < arr[9]) arr[6]++;
                else arr[9]++;
            } else if (ch - '0' == 9) {
                if (arr[9] < arr[6]) arr[9]++;
                else arr[6]++;
            }
            else arr[ch - '0']++;
        }

        Arrays.sort(arr);

        System.out.println(arr[9]);
    }
}
