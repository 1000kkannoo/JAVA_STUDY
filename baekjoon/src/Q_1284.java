import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_1284 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String number = br.readLine();
            if (number.equals("0")) break;

            int sum = (number.length() - 1) + 2;
            for (String s : number.split("")) {
                if (s.equals("1")) {
                    sum += 2;
                } else if (s.equals("0")) {
                    sum += 4;
                } else {
                    sum += 3;
                }
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
