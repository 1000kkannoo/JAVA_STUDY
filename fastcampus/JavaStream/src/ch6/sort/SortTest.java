package ch6.sort;

import ch6.filter.Order;
import ch6.filter.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -5, 7, 4);
        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);

        User user1 = new User()
                .setId(101)
                .setName("JackGR")
                .setVerified(true)
                .setEmailAddress("jack@gmail.com");

        User user2 = new User()
                .setId(102)
                .setName("KevinDB")
                .setVerified(false)
                .setEmailAddress("kevin@gmail.com");
        User user3 = new User()
                .setId(103)
                .setName("Halland")
                .setVerified(false)
                .setEmailAddress("halland@gmail.com");

        List<User> users = Arrays.asList(user1, user2, user3);
        List<User> sortedUsers = users.stream()
                .sorted((u1, u2) -> u1.getName().compareTo(u2.getName()))
                .collect(Collectors.toList());
        System.out.println(sortedUsers);

        LocalDateTime now = LocalDateTime.now(ZoneId.of("Asia/Seoul"));

        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedByUserId(101)
                .setCreatedAt(now.minusHours(4));

        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(103)
                .setCreatedAt(now.minusHours(1));

        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedByUserId(102)
                .setCreatedAt(now.minusHours(36));

        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(104)
                .setCreatedAt(now.minusHours(40));

        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedByUserId(101)
                .setCreatedAt(now.minusHours(10));

        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);

        // TODO: 생성날짜에 다른 정렬 구현
        List<Order> sortedCreateAtOrder = orders.stream()
                .sorted((o1, o2) -> o1.getCreatedAt().compareTo(o2.getCreatedAt()))
                .collect(Collectors.toList());
        System.out.println(sortedCreateAtOrder);
    }
}
