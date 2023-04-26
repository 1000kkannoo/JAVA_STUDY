package ch6.filterAndMap;

import ch6.filter.Order;
import ch6.filter.User;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapTest {
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

/*
        List<String> emails = new ArrayList<>();
        일반 for문과 조건문을 이용해 검증된 유저만 가져오는 방
        for (User user : users) {
            if (user.isVerified()) {
                String email = user.getEmailAddress();
                emails.add(email);
            }
        }
        System.out.println(emails)
*/
        List<String> emails = users.stream()
                .filter(user -> !user.isVerified())
                .map(User::getEmailAddress)
                .collect(Collectors.toList());

        System.out.println(emails);

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

        // TODO: Error 상태인 Order 중 UserId만 추출하기
        List<Long> filteredOrderList = orders.stream()
                .filter(order -> order.getStatus() == Order.OrderStatus.ERROR)
                .map(Order::getCreatedByUserId)
                .collect(Collectors.toList());

        System.out.println(filteredOrderList);

        // TODO : Error 상태인 Order 중에서 만들어진지 24 시간 이내인 Order만 골라내기
        List<Order> filteredStatusAndCreatedAtOrderList = orders.stream()
                .filter(order -> order.getStatus() == Order.OrderStatus.ERROR)
                .filter(order -> order.getCreatedAt().isAfter(now.minusHours(24)))
                .collect(Collectors.toList());

        System.out.println(filteredStatusAndCreatedAtOrderList);
    }
}
