package test.java.lsp;

import main.java.lsp.CalculateArea;
import main.java.srp.Circle;
import main.java.srp.Form;
import main.java.srp.GeometryForm;
import main.java.srp.Rectangle;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateAreaTest {

    @Test
    public void calculateSumAreaTest() {
        //Arrange
        Rectangle rectangle = new Rectangle(2, 2);
        Circle circle = new Circle(3);
        Form [] forms = {rectangle, circle};

        //Act
        double areaCalculate = CalculateArea.calculateTotalArea(forms);
        double areaEstimated = GeometryForm.getArea(rectangle) + GeometryForm.getArea(circle);

        //Assert
        assertEquals(areaCalculate, areaEstimated);
    }
}
