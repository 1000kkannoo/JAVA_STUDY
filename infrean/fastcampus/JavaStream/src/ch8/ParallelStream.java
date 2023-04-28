package ch8;

// Stream을 병렬 처리
// 속도가 비약적으로 향상
// 간단하게 병렬 처리 가능

import ch8.Service.EmailService;
import ch8.model.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 그렇지만 항상 속도가 빨라지는 것 아님 / 오류가 생길 수 있음 / 병렬처리를 위해 작업을 해주면 오히려 순차보다 느려질 수 있음
public class ParallelStream {
    public static void main(String[] args) {
        User user1 = new User()
                .setId(101)
                .setName("KevinDB")
                .setEmailAddress("kevin@gmail.com")
                .setVerified(true);
        User user2 = new User()
                .setId(102)
                .setName("JackGR")
                .setEmailAddress("jack@gmail.com")
                .setVerified(true);
        User user3 = new User()
                .setId(103)
                .setName("Halland")
                .setEmailAddress("halland@gmail.com")
                .setVerified(true);
        User user4 = new User()
                .setId(104)
                .setName("dias")
                .setEmailAddress("dias@gmail.com")
                .setVerified(true);
        User user5 = new User()
                .setId(105)
                .setName("Rodrigo")
                .setEmailAddress("Rodrigo@gmail.com")
                .setVerified(false);
        User user6 = new User()
                .setId(106)
                .setName("fodden")
                .setEmailAddress("fodden@gmail.com")
                .setVerified(false);


        List<User> users = Arrays.asList(user1, user2, user3, user4, user5, user6);

        long startTime = System.currentTimeMillis();
        EmailService emailService = new EmailService();
        users.stream()
                .filter(user -> !user.isVerified())
                .forEach(emailService::sendVerifyYourEmailEmail);
        long endTime = System.currentTimeMillis();
        System.out.println("Sequential : " + (endTime - startTime) + "ms");

        startTime = System.currentTimeMillis();
        users.stream().parallel()
                .filter(user -> !user.isVerified())
                .forEach(emailService::sendVerifyYourEmailEmail);
        endTime = System.currentTimeMillis();
        System.out.println("Parallel : " + (endTime - startTime) + "ms");

        List<User> processedUsers = users.parallelStream()
                .map(user -> {
                    System.out.println("Capitalize user name for user " + user.getId());
                    user.setName(user.getName().toUpperCase());
                    return user;
                })
                .map(user -> {
                    System.out.println("Set 'isVerified' to true for user" + user.getId());
                    user.setVerified(true);
                    return user;
                })
                .collect(Collectors.toList());

        System.out.println(processedUsers);
    }
}
