package ch6.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserOrderTest {
    public static void main(String[] args) {
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
        List<User> verifiedUsers = users.stream()
                .filter(User::isVerified)
                .collect(Collectors.toList());

        System.out.println(verifiedUsers);

        List<User> unverifiedUsers = users.stream()
                .filter(user -> !user.isVerified())
                .collect(Collectors.toList());

        System.out.println(unverifiedUsers);

        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED);

        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR);

        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED);

        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR);

        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS);

        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
        List<Order> filteredOrders = orders.stream()
                .filter(order -> order.getStatus() != Order.OrderStatus.ERROR)
                .collect(Collectors.toList());

        System.out.println(filteredOrders);
    }
}
