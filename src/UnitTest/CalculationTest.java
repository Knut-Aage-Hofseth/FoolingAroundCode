package UnitTest;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import Enum.Calculation;

public class CalculationTest {

    @Test
    public void squareArea()
    {
        assertEquals(1, Calculation.area("square", 1), 0.001);
    }

    @Test
    public void squareAreaFault ()
    {
        Assert.assertNotEquals(2, Calculation.area("square", 1), 0.001);
    }

    @Test
    public void rectangleArea()
    {
        assertEquals(3.15, Calculation.area("rectangle", 1.5, 2.1), 0.001);
    }

    @Test
    public void circleArea()
    {
        assertEquals(3.141592, Calculation.area("circle", 1), 0.0001);
    }

    @Test
    public void triangelArea()
    {
        assertEquals(2, Calculation.area("triangel", 2, 2), 0.0001);
    }
}
