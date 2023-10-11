import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_1526 {
    private static Integer MAX_VALUE = Integer.MIN_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for (int i = 1; i <= num; i++) {
            String str = String.valueOf(i);
            boolean isMinSoo = true;
            for (String n : str.split("")) {
                if (!n.equals("4") && !n.equals("7")) {
                    isMinSoo = false;
                    break;
                }
            }

            if (isMinSoo) {
                MAX_VALUE = Math.max(MAX_VALUE, i);
            }
        }

        System.out.println(MAX_VALUE);
    }
}
