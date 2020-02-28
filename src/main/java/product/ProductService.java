package product;

public class ProductService {
    public static double christmasDiscount(double cost){
        return 0.15 * cost;
    }

    public static double easterDiscount(double cost){
        return 0.10 * cost;
    }

    public static double newYearDiscount(double cost){
        return 0.2 * cost;
    }

}
