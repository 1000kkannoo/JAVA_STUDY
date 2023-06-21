import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q_10815 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(solution(arr1, arr2));

    }

    private static String solution(int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr1);
        for (int num : arr2) {
            if (Arrays.binarySearch(arr1, num) >= 0) sb.append(1 + " ");
            else sb.append(0 + " ");
        }
        return sb.toString();
    }
}
