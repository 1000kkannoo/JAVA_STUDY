import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_21300 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int[] arr = new int[split.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum * 5;
    }
}
