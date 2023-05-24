package ch10;

import ch10.model.User;

public class BuilderTest {
    public static void main(String[] args) {
        User user = User.builder(1,"Alice")
                .with(builder -> {
                    builder.emailAddress = "allice@fastcampus.co.kr";
                    builder.isVerified = true;
                })
                .build();
        System.out.println(user);
    }
}
