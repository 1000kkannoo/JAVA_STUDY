import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class People2 {
    private String name;
    private String answer;

    private People2(String name, String answer) {
        this.name = name;
        this.answer = answer;
    }

    public static People2 create(String name, String answer) {
        return new People2(name, answer);
    }

    public String getName() {
        return name;
    }

    public String getAnswer() {
        return answer;
    }
}

public class Q_20362 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        String winner = input[1];
        String word = "";

        People2[] peoples = new People2[n];
        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            peoples[i] = People2.create(split[0],split[1]);
            if (split[0].equals(winner)) {
                word = split[1];
            }
        }

        int sum = 0;
        for (People2 people : peoples) {
            if (people.getName().equals(winner)) {
                break;
            } else if (people.getAnswer().equals(word)) {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
