package ch10;

import ch10.model.User;
import ch10.service.InternalUserService;
import ch10.service.UserService;
import ch10.service.UserServiceInFunctionalWay;

import java.util.Arrays;

public class TemplateTest {
    public static void main(String[] args) {
        User kevin = User.builder(1, "kevin")
                .with(builder -> {
                    builder.emailAddress = "kevin@fastcampus.co.kr";
                    builder.isVerified = false;
                    builder.friendUserIds = Arrays.asList(201, 202, 203, 204, 211, 212, 213, 214);
                })
                .build();

        UserService userService = new UserService();
        InternalUserService internalUserService = new InternalUserService();
//        userService.createUser(kevin);
//        internalUserService.createUser(kevin);

        UserServiceInFunctionalWay userServiceInFunctionalWay = new UserServiceInFunctionalWay(
                user -> {
                    System.out.println("Validating user " + user.getName());
                    return user.getName() != null && user.getEmailAddress().isPresent();
                },
                user -> {
                    System.out.println("Writing user " + user.getName() + " to DB");
                });
        userServiceInFunctionalWay.createUser(kevin);
    }
}
