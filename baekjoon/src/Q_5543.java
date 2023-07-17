import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q_5543 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int minBurger = Integer.MAX_VALUE;
        int minDrink = Integer.MAX_VALUE;

        for (int i = 0; i < 3; i++) {
            minBurger = Math.min(minBurger, Integer.parseInt(br.readLine()));
        }

        for (int i = 0; i < 2; i++) {
            minDrink = Math.min(minDrink, Integer.parseInt(br.readLine()));
        }

        System.out.println(minBurger + minDrink - 50);
    }
}
