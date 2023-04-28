package pr1_Decorator;

public class CoffeeTest {

    public static void main(String[] args) {
        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();

        System.out.println("\n**************");

        Coffee kenyaLatte = new Latte(new KenyaAmericano());
        kenyaLatte.brewing();

        System.out.println("\n**************");
        Coffee etiopiaLatte = new Latte(new EtiopiaAmericano());
        etiopiaLatte.brewing();

        Coffee whippedCreamEtiopia =
                new WhippedCream(new Mocha(new Latte(new EtiopiaAmericano())));
        whippedCreamEtiopia.brewing();
    }
}
