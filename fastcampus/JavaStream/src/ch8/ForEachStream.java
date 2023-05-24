package ch8;

import ch8.Service.EmailService;
import ch8.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ForEachStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3,5,2,1);
//        numbers.stream().forEach(number -> System.out.println("The number is " + number));
//        numbers.forEach(number -> System.out.println("The number is " + number));

        User user1 = new User()
                .setId(101)
                .setName("KevinDB")
                .setEmailAddress("kevin@gmail.com")
                .setVerified(true);
        User user2 = new User()
                .setId(102)
                .setName("JackGR")
                .setEmailAddress("jack@gmail.com")
                .setVerified(false);
        User user3 = new User()
                .setId(103)
                .setName("Halland")
                .setEmailAddress( "halland@gmail.com")
                .setVerified(false);

        List<User> users = Arrays.asList(user1, user2, user3);
        EmailService emailService = new EmailService();

        users.stream()
                .filter(user -> !user.isVerified())
                .forEach(emailService::sendVerifyYourEmailEmail);

        IntStream.range(0,users.size()).forEach(i ->{
            User user = users.get(i);
            System.out.println("Do an operation on user " + user.getName() + " at index " + i);
        });
    }
}
