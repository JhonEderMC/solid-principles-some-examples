package main.ocp;

public class DiscountPercentage implements Discount {

    private int percentage;


    public DiscountPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return (price - (price * ((double) this.percentage /100)));
    }
}
