package week2;

import week2.controller.BaseBallController;
import week2.view.BaseBallView;

public class BaseBall {
    public static void main(String[] args) {
        BaseBallView baseBallView = new BaseBallView();
        BaseBallController baseBallController = new BaseBallController(baseBallView);

        baseBallController.play();
    }
}
