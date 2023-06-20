import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q_10989 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
        System.out.println(solution(arr));
    }

    private static StringBuilder solution(int[] arr) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        for (int num : arr) sb.append(num).append("\n");
        return sb;
    }
}
