package pr2;

public class Car {
    private static int serialNum = 10000;
    private int carNum;

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public static void checkSerialNum() {
        System.out.println("현재 Serial Number : " + serialNum);
    }
}
