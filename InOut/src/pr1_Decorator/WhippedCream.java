package pr1_Decorator;

public class WhippedCream extends Decorator{

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        System.out.print("Adding WhippedCream");
    }
}
