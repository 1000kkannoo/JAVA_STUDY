package ch6.map;

import ch6.filter.Order;
import ch6.filter.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UserOrderMapTest {
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
        List<String> emailAddresses = users.stream()
                .map(User::getEmailAddress)
                .collect(Collectors.toList());
        System.out.println(emailAddresses);

        Order order1 = new Order()
                .setId(1001)
                .setStatus(Order.OrderStatus.CREATED)
                .setCreatedByUserId(101);

        Order order2 = new Order()
                .setId(1002)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(103);

        Order order3 = new Order()
                .setId(1003)
                .setStatus(Order.OrderStatus.PROCESSED)
                .setCreatedByUserId(102);

        Order order4 = new Order()
                .setId(1004)
                .setStatus(Order.OrderStatus.ERROR)
                .setCreatedByUserId(104);

        Order order5 = new Order()
                .setId(1005)
                .setStatus(Order.OrderStatus.IN_PROGRESS)
                .setCreatedByUserId(101);

        List<Order> orders = Arrays.asList(order1, order2, order3, order4, order5);
        List<Long> createdByUserIdList = orders.stream()
                .map(Order::getCreatedByUserId)
                .collect(Collectors.toList());
        System.out.println(createdByUserIdList);
    }
}
