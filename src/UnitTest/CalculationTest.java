package UnitTest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Enum.Calculation;
import Enum.Geometry;

public class CalculationTest {

    @Test
    public void squareArea()
    {
        assertEquals(1, Calculation.area(Geometry.SQUARE, 1), 0.001);
    }

    @Test
    public void squareAreaFault ()
    {
        Assert.assertNotEquals(2, Calculation.area(Geometry.SQUARE, 1), 0.001);
    }

    @Test
    public void rectangleArea()
    {
        assertEquals(3.15, Calculation.area(Geometry.RECTANGLE, 1.5, 2.1), 0.001);
    }

    @Test
    public void circleArea()
    {
        assertEquals(3.141592, Calculation.area(Geometry.CIRCLE, 1), 0.0001);
    }
}
