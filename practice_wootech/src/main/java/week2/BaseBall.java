package week2;

import week2.controller.BaseBallController;
import week2.service.BaseBallService;
import week2.view.BaseBallView;

public class BaseBall {
    public static void main(String[] args) {
        BaseBallService baseBallService = new BaseBallService();
        BaseBallView baseBallView = new BaseBallView(System.in);
        BaseBallController baseBallController = new BaseBallController(baseBallService, baseBallView);

        baseBallController.play();
    }
}
