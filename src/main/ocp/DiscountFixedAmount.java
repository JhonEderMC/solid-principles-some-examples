package main.ocp;

public class DiscountFixedAmount implements Discount {

    private double fixAmount;

    public DiscountFixedAmount(double fixAmount) {
        this.fixAmount = fixAmount;
    }

    public double getFixAmount() {
        return fixAmount;
    }

    public void setFixAmount(double fixAmount) {
        this.fixAmount = fixAmount;
    }

    @Override
    public double applyDiscount(double price) {
        return price - this.fixAmount;
    }
}
