package product.strategy;

public class NewYearStrategy implements DiscountStrategy {

    @Override
    public double discount(double cost) {
        return 0.15 * cost;
    }
}
