import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_2684 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T --> 0) {
            int[] arr = new int[8];
            StringBuilder word = new StringBuilder();
            String[] split = br.readLine().split("");
            for (int lt = 0, rt = 2; rt < split.length; lt++, rt++) {
                for (int i = lt; i <= rt; i++) {
                    word.append(split[i]);
                }
                checkStrCase(word, arr);
                word.setLength(0);
            }
            appendAnswer(sb, arr);
        }

        System.out.println(sb);
    }

    private static void appendAnswer(StringBuilder sb, int[] arr) {
        for (int i : arr) {
            sb.append(i).append(" ");
        }
        sb.append("\n");
    }

    private static void checkStrCase(StringBuilder sb2, int[] arr) {
        switch (sb2.toString()) {
            case "TTT" : arr[0]++; break;
            case "TTH" : arr[1]++; break;
            case "THT" : arr[2]++; break;
            case "THH" : arr[3]++; break;
            case "HTT" : arr[4]++; break;
            case "HTH" : arr[5]++; break;
            case "HHT" : arr[6]++; break;
            case "HHH" : arr[7]++; break;
        }
    }
}
