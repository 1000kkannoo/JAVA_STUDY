import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Q_1181 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) set.add(br.readLine());

        ArrayList<String> arr = new ArrayList<>(set);
        Collections.sort(arr, (a, b) -> {
            if (a.length() == b.length()) return a.compareTo(b);
            else return a.length() - b.length();
        });

        for (String s : arr) sb.append(s).append("\n");

        System.out.println(sb);
    }
}
