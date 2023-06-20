import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Human implements Comparable<Human> {
    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Human o) {
        return this.age - o.age;
    }
}

public class Q_10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Human> humans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            humans.add(new Human(age, name));
        }
        Collections.sort(humans);
        for (Human human : humans) {
            System.out.println(human.age + " " + human.name);
        }
    }
}
