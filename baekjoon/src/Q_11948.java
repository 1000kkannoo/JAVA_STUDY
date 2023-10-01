import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q_11948 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum1 = getArr1Result(br);
        int sum2 = getArr2Result(br);

        System.out.println(sum1 + sum2);
    }

    private static int getArr2Result(BufferedReader br) throws IOException {
        int[] arr2 = new int[2];
        for (int i = 0; i < 2; i++) {
            arr2[i] = Integer.parseInt(br.readLine());
        }
        return Math.max(arr2[0], arr2[1]);
    }

    private static int getArr1Result(BufferedReader br) throws IOException {
        int[] arr1 = new int[4];

        for (int i = 0; i < 4; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr1);
        return arr1[3] + arr1[2] + arr1[1];
    }
}
