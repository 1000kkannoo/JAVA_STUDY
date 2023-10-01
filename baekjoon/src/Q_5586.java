import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_5586 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int joiCount = 0;
        int ioiCount = 0;
        for (int lt = 0, rt = 2; rt < str.length(); rt++, lt++) {
            String substring = str.substring(lt, rt + 1);
            if (substring.equals("JOI")) {
                joiCount++;
            } else if (substring.equals("IOI")) {
                ioiCount++;
            }
        }

        System.out.println(joiCount);
        System.out.println(ioiCount);
    }
}
