package ch15;

public class Customer implements Buy, Sell{
    @Override
    public void buy() {
        System.out.println("customer sell");
    }

    // 각각의 인터페이스에 같은 메서드가 default 메서드로 존재하기에
    // 새로 재정의 해야함
    @Override
    public void order() {
        System.out.println("customer order");
    }

    @Override
    public void sell() {
        System.out.println("customer buy");
    }

    public void hello() {
        System.out.println("sayHello!");
    }


}
