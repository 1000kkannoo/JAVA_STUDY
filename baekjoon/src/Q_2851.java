import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            sum += num;
            arr[i] = sum;
        }

        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100) {
                index = i;
                break;
            }
        }

        if (arr[9] < 100) System.out.println(arr[9]);
        else if (index == 0) System.out.println(arr[index]);
        else {
            int point = Math.abs(100 - arr[index]);
            int prev = Math.abs(100 - arr[index - 1]);
            if (point <= prev) {
                System.out.println(arr[index]);
            } else {
                System.out.println(arr[index - 1]);
            }
        }
    }
}
