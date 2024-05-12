package main.ocp;

public class TestOcp {

    public static void test() {
        DiscountPercentage discountPercentage = new DiscountPercentage(7);
        DiscountFixedAmount discountFixedAmount = new DiscountFixedAmount(40);

        System.out.println("100$ will have discount to 7%: " + TestOcp.applyDiscount(discountPercentage, 100));
        System.out.println("100$ will have discount to 40$: " + TestOcp.applyDiscount(discountFixedAmount, 100));
    }

    public static double applyDiscount(Discount discount, double price) {
        return discount.applyDiscount(price);
    }
}
