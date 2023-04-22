package ch15;

public class CustomerTest {

    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.sell();
        customer.buy();
        customer.hello();

        Buy buyer = customer;
        buyer.buy();

        Sell seller = customer;
        seller.sell();

        customer.order();
    }
}
