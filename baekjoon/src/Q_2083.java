import java.io.BufferedReader;
import java.io.InputStreamReader;

class ClubUser {
    private final String name;
    private final Integer age;
    private final Integer weight;

    private ClubUser(String name, Integer age, Integer weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public static ClubUser toEntity(String name, Integer age, Integer weight) {
        return new ClubUser(name, age, weight);
    }

    public String getExperienceLevel() {
        if (age > 17 || weight >= 80) {
            return "Senior";
        } else {
            return "Junior";
        }
    }

    public String getName() {
        return name;
    }
}

public class Q_2083 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String str = br.readLine();
            if (str.equals("# 0 0")) {
                break;
            }

            String[] split = str.split(" ");
            ClubUser user = ClubUser.toEntity(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]));
            sb.append(user.getName()).append(" ").append(user.getExperienceLevel()).append("\n");
        }

        System.out.println(sb);
    }
}
