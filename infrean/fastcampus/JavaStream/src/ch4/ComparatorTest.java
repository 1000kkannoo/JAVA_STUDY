package ch4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User {
    private int id;
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorTest {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(3,"KevinDB"));
        users.add(new User(1,"JackGR"));
        users.add(new User(5,"Halland"));
//        System.out.println(users);

        Comparator<User> idComparator = (u1, u2) -> u1.getId() - u2.getId();
        Collections.sort(users,idComparator);
//        System.out.println(users);

        Collections.sort(users,(u1, u2) -> u1.getName().compareTo(u2.getName()));
        System.out.println(users);
    }
}
