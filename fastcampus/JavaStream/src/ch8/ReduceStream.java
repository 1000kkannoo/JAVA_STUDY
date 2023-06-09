package ch8;

import ch8.model.Order;
import ch8.model.OrderLine;
import ch8.model.User;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ReduceStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, -2, -5, 3);
        Integer sum = numbers.stream()
                .reduce((x, y) -> x + y)
                .get();
        System.out.println("numbers sum : " + sum);

        Integer min = numbers.stream()
                .reduce((x, y) -> x < y ? x : y)
                .get();
        System.out.println("numbers min : " + min);

        // 초기값 설정
        Integer product = numbers.stream()
                .reduce(1, (x, y) -> x * y);
        System.out.println("numbers product : " + product);

        List<String> numberStrList = Arrays.asList("3", "2", "5", "-4");
        Integer sumOfNumberStrList = numberStrList.stream()
                .map(Integer::parseInt)
                .reduce(0, (x, y) -> x + y);
        System.out.println("sumOfNumberStrList : " + sumOfNumberStrList);

        // map 과 reduce 를 나눠서 쓰는게 보편적임
        Integer sumOfNumberStrList2 = numberStrList.stream()
                .reduce(0, (number, str) ->
                        number + Integer.parseInt(str), (num1, num2) -> num1 + num2);
        System.out.println("sumOfNumberStrList2 : " + sumOfNumberStrList2);

        User user1 = new User()
                .setId(101)
                .setName("KevinDB")
                .setEmailAddress("kevin@gmail.com")
                .setVerified(true)
                .setFriendUserIds(Arrays.asList(201, 202, 203, 204));
        User user2 = new User()
                .setId(102)
                .setName("JackGR")
                .setEmailAddress("jack@gmail.com")
                .setVerified(true)
                .setFriendUserIds(Arrays.asList(204, 205, 206));
        User user3 = new User()
                .setId(103)
                .setName("Halland")
                .setEmailAddress("halland@gmail.com")
                .setVerified(true)
                .setFriendUserIds(Arrays.asList(204, 205, 207));

        List<User> users = Arrays.asList(user1, user2, user3);
        Integer sumOfNumberOfFriends = users.stream()
                .map(User::getFriendUserIds)
                .map(List::size)
                .reduce(0, (x, y) -> x + y);
        System.out.println("sumOfNumberOfFriends : " + sumOfNumberOfFriends);

        Order order1 = new Order()
                .setId(1001L)
                .setOrderLines(Arrays.asList(
                        new OrderLine()
                                .setAmount(BigDecimal.valueOf(1000)),
                        new OrderLine()
                                .setAmount(BigDecimal.valueOf(2000))));
        Order order2 = new Order()
                .setId(1002L)
                .setOrderLines(Arrays.asList(
                        new OrderLine()
                                .setAmount(BigDecimal.valueOf(2000)),
                        new OrderLine()
                                .setAmount(BigDecimal.valueOf(3000))));
        Order order3 = new Order()
                .setId(1002L)
                .setOrderLines(Arrays.asList(
                        new OrderLine()
                                .setAmount(BigDecimal.valueOf(1000)),
                        new OrderLine()
                                .setAmount(BigDecimal.valueOf(2000))));

        List<Order> orders = Arrays.asList(order1, order2, order3);

        // TODO : Amount의 총합을 구하세요!
        BigDecimal sumOfOrderAmount = orders.stream()
                .map(Order::getOrderLines) // Stream<List<OrderLine>>
                .flatMap(List::stream) // Stream(OrderLine)
                .map(orderLine -> orderLine.getAmount()) // Stream<BigDecimal>
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("sumOfOrderAmount : " + sumOfOrderAmount);

    }
}
