package practice1;

import practice1.controller.OrderController;
import practice1.model.OrderManager;
import practice1.view.InputView;
import practice1.view.OutputView;

public class Application {
    static InputView inputView = new InputView();
    static OutputView outputView = new OutputView();
    static OrderManager orderManager = new OrderManager();

    public static void main(String[] args) {
        try {
            OrderController orderController = new OrderController(inputView, outputView, orderManager);
            orderController.run();
        } finally {
            inputView.closeScanner();
        }
    }
}
