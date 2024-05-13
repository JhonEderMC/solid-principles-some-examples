package test.java.ocp;

import main.java.ocp.DiscountFixedAmount;
import main.java.ocp.DiscountPercentage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountTest {

    @DisplayName("When there's fixed discount")
    @Test
    public void discountFixedTest() {
        //Arrange
        double amount = 100;
        double fixedAmount = 40;

        //Act
        DiscountFixedAmount discountFixedAmount = new DiscountFixedAmount(fixedAmount);

        //Assert
        assertEquals(discountFixedAmount.applyDiscount(amount), (amount-fixedAmount));
    }

    @DisplayName("When there's percentage discount")
    @Test
    public void discountPercentageTest() {
        //Arrange
        double amount = 100;
        int percentage = 40;

        //Act
        DiscountPercentage discountPercentage = new DiscountPercentage(percentage);

        //Assert
        assertEquals(discountPercentage.applyDiscount(amount), 60);
    }
}
