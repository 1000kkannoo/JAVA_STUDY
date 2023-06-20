import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q_10816 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr1 = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) arr1[i] = Integer.parseInt(st.nextToken());

        int m = Integer.parseInt(br.readLine());
        int[] arr2 = new int[m];
        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < m; i++) arr2[i] = Integer.parseInt(st.nextToken());

        System.out.println(solution(arr1, arr2));
    }

    private static String solution(int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr1) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int key : arr2) sb.append(map.getOrDefault(key, 0)).append(" ");

        return sb.toString();
    }
}
