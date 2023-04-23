package pr1;

public class BeginnerLevel extends PlayerLevel{

    @Override
    public void run() {
        System.out.println("천천히 달립니다.");
    }

    @Override
    public void jump() {
        System.out.println("jump 못함");
    }

    @Override
    public void turn() {
        System.out.println("turn 못함");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("***** 초급자레벨 입니다. *****");
    }
}
