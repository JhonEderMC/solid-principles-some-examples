package test.srp;

import main.Main;
import main.srp.Circle;
import main.srp.GeometryForm;
import main.srp.Rectangle;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometryFormTest {

    @DisplayName("Calculate area of a rectangle")
    @Test
    public void rectangleCalculateAreaTest() {
        //Arrange
        Rectangle rectangle = new Rectangle(2, 2);

        //Act
        double area = GeometryForm.getArea(rectangle);

        //Assert
        assertEquals(area, 4);
    }

    @DisplayName("Calculate area of a circle")
    @Test
    public void circleCalculateAreaTest() {
        //Arrange
        double radius = 3;
        Circle circle = new Circle(radius);

        //Act
        double area = GeometryForm.getArea(circle);

        //Assert
        assertEquals(area, Math.PI * Math.pow(radius, 2));
    }
}
