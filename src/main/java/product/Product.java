package product;

import product.strategy.*;

public class Product {
    private String name;
    private String description;
    private double cost;
    private double discount;
    private DiscountStrategy discountStrategy;

    public Product(String name, String description, double cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void discount(DiscountType discountType) {
        if (DiscountType.CHRISTMAS.equals(discountType)) {
            discountStrategy = new ChristmasStrategy();
            discount = discountStrategy.discount(this.getCost());
        }
         else if (DiscountType.EASTER.equals(discountType)){
            discountStrategy = new EasterStrategy();
           discount = discountStrategy.discount(this.getCost());
        }
        else if (DiscountType.NEWYEAR.equals((discountType))){
            discountStrategy = new NewYearStrategy();
           discount =  discountStrategy.discount(this.getCost());
        }else{
            throw new IllegalArgumentException("wrong discount");
        }

    }

    public void showProductInfo() {
        System.out.println(this.name + ", it cost only: " +
                (this.cost - this.discount) + " PLN. " +
                this.discount + " PLN discount from " + this.cost + " PLN");
    }
}
