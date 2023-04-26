package ch5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest2 {
    public static void main(String[] args) {
        Function<String, Integer> strLength = String::length;
        int length = strLength.apply("hello world");
//        System.out.println(length);

        BiPredicate<String, String> strEquals = String::equals;
        boolean equals = strEquals.test("test", "test2");
//        System.out.println(equals);

        List<User> users = new ArrayList<>();
        users.add(new User(3, "KevinDb"));
        users.add(new User(1, "JackGR"));
        users.add(new User(5, "ERHalland"));

        printUserField(users, User::getName);
    }

    public static void printUserField(List<User> users, Function<User,Object> getter) {
        for (User user : users) {
            System.out.println(getter.apply(user));
        }
    }
}
