package ch8;

import ch8.model.Order;
import ch8.model.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class MatchStreamTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, -4, 2, 7, 9);
        boolean allPositive = numbers.stream()
                .allMatch(number -> number > 0);
        System.out.println("Are all numbers positive: " + allPositive);

        boolean anyNegative = numbers.stream()
                .anyMatch(number -> number < 0);
        System.out.println("Is any number negative : " + anyNegative);

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

        List<User> users = Arrays.asList(user1, user2, user3);

        boolean areAllUserVerified = users.stream()
                .allMatch(User::isVerified);
        System.out.println("areAllUserVerified : " + areAllUserVerified);

        Order order1 = new Order()
                .setId(1001L)
                .setAmount(BigDecimal.valueOf(2000))
                .setStatus(Order.OrderStatus.CREATED);
        Order order2 = new Order()
                .setId(1002L)
                .setAmount(BigDecimal.valueOf(4000))
                .setStatus(Order.OrderStatus.PROCESSED);
        Order order3 = new Order()
                .setId(1003L)
                .setAmount(BigDecimal.valueOf(3000))
                .setStatus(Order.OrderStatus.IN_PROGRESS);
        Order order4 = new Order()
                .setId(1003L)
                .setAmount(BigDecimal.valueOf(7000))
                .setStatus(Order.OrderStatus.ERROR);

        List<Order> orders = Arrays.asList(order1, order2, order3, order4);

        // TODO : Oredrs 에서 Error 상태인 Order가 하나라도 있으면 TRUE
        boolean isAnyOrderInErrorStatus = orders.stream()
                .anyMatch(order -> order.getStatus() == Order.OrderStatus.ERROR);
        System.out.println("isAnyOrderInErrorStatus : " + isAnyOrderInErrorStatus);
    }
}
