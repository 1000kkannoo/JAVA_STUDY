import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_28444 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int length = split.length;

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        System.out.println(solution(arr));
    }

    private static int solution(int[] arr) {
        return (arr[0] * arr[1]) - (arr[2] * arr[3] * arr[4]);
    }
}
