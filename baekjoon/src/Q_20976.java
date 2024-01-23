import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_20976 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        String[] split = br.readLine().split(" ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        Arrays.sort(arr);
        return arr[1];
    }
}
