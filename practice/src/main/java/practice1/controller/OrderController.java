package practice1.controller;

import practice1.model.Order;
import practice1.model.OrderManager;
import practice1.view.InputView;
import practice1.view.OutputView;

import java.util.List;
import java.util.Map;

public class OrderController {
    public static final String PRODUCT = "pid";
    public static final String QUANTITY = "quantity";
    public static final String PRICE = "price";

    private final InputView inputView;
    private final OutputView outputView;
    private final OrderManager orderManager;

    public OrderController(InputView inputView, OutputView outputView, OrderManager orderManager) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.orderManager = orderManager;
    }

    public void run() {
        outputView.printOrderStart();
        while (true) {
            outputView.printOrderProcess();
            Integer select = inputView.selectProcess();

            if (select.equals(1)) {
                addOrder();
            } else if (select.equals(2)) {
                updateOrder();
            } else if (select.equals(3)) {
                deleteOrder();
            } else if (select.equals(4)) {
                readOrder();
            } else if (select.equals(5)) {
                readSumPrice();
            } else if (select.equals(0)) {
                break;
            } else {
                throw new IllegalArgumentException("프로세스에 존재하지 않는 번호입니다.");
            }
        }
    }

    // 주문 총 금액 조회
    private void readSumPrice() {
        Integer sumPrice = orderManager.readAllOrderPrice();
        outputView.printAllOrderPrice(sumPrice);
    }

    // 주문 목록 조회
    private void readOrder() {
        outputView.printOrderList(orderManager.getOrders());
    }

    // 주문 삭제
    private void deleteOrder() {
        Long productId = inputView.inputDeleteOrder();
        orderManager.deleteOrder(productId);
    }

    // 주문 추가
    private void addOrder() {
        Order order = inputView.inputOrder();
        orderManager.addOrder(order);
    }

    // 주문 수정
    private void updateOrder() {
        Map<String, Object> orderMap = inputView.inputUpdateOrder();
        Long pid = (Long) orderMap.get(PRODUCT);
        Integer quantity = (Integer) orderMap.get(QUANTITY);
        Integer price = (Integer) orderMap.get(PRICE);

        List<Order> orders = orderManager.getOrders();
        Order findOrder = findOrderByProductId(pid, orders);

        updateProcess(quantity, price, orders, findOrder);
    }

    private static void updateProcess(Integer quantity, Integer price, List<Order> orders, Order findOrder) {
        orders.remove(findOrder);
        findOrder.updateOrder(quantity, price);
        orders.add(findOrder);
    }

    private static Order findOrderByProductId(Long pid, List<Order> orders) {
        return orders.stream()
                .filter(order -> order.getProductId().equals(pid))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("해당 Order는 존재하지 않습니다."));
    }

}
