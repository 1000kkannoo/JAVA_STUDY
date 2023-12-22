import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_18411 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[1] + arr[2]);
    }
}
