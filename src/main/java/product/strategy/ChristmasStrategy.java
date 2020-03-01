package product.strategy;

public class ChristmasStrategy implements DiscountStrategy {
    @Override
    public double discount(double cost) {
        return 0.2 * cost;
    }
}
