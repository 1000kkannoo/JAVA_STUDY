import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q_25191 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int chicken = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        int coke = Integer.parseInt(split[0]);
        int beer = Integer.parseInt(split[1]);
        int eat = (coke / 2) + beer;

        if (eat > chicken) {
            eat = chicken;
        }
        System.out.println(eat);
    }
}
