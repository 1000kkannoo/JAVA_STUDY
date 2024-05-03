import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class Student {
    private final String name;
    private final int korean;
    private final int english;
    private final int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKorean() {
        return korean;
    }

    public int getEnglish() {
        return english;
    }

    public int getMath() {
        return math;
    }
}

public class Q_10825 {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            students[i] = new Student(split[0], Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
        }

        Arrays.sort(students, (s1, s2) -> {
            if (s1.getKorean() == s2.getKorean() && s1.getMath() == s2.getMath() && s1.getEnglish() == s2.getEnglish()) {
                return s1.getName().compareTo(s2.getName());
            } else if (s1.getKorean() == s2.getKorean() && s1.getEnglish() == s2.getEnglish()) {
                return s2.getMath() - s1.getMath();
            } else if (s1.getKorean() == s2.getKorean()) {
                return s1.getEnglish() - s2.getEnglish();
            }
            return s2.getKorean() - s1.getKorean();
        });

        for (Student student : students) {
            sb.append(student.getName()).append("\n");
        }

        System.out.println(sb);
    }
}
