package ch01;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerId(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerId(10020);
        customerKim.bonusPoint = 10000;
        System.out.println(customerKim.showCustomerInfo());
        customerKim.checkMyAgentId();
        customerKim.changeAgentId(12);
        customerKim.checkMyAgentId();

        VIPCustomer customerPark = new VIPCustomer();
        customerPark.setCustomerName("박지성");
        customerPark.setCustomerId(10030);
        customerPark.bonusPoint = 5000;
        System.out.println(customerPark.showCustomerInfo());
        customerPark.checkMyAgentId();
    }
}
