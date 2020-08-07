package bootstrap.Square;

import bootstrap.IsShape;
import junit.framework.TestCase;
import org.junit.Test;

public class SquareTest extends TestCase {
    IsShape square;

    public void setUp() {
        square = new Square(2.0d);
    }

    @Test
    public void testArea() {
        // area of square is expected to be 4.0
        double expectedArea = 4.0d;
        double actualArea   = square.getArea();
        assertEquals(expectedArea, actualArea, 0.001d);
        System.out.println("Area test passed. double parameter");

        square       = new Square(1);
        expectedArea = 1;
        actualArea   = square.getArea();
        assertEquals(expectedArea, actualArea, 0.001d);
        System.out.println("Area test passed. Integer parameter");
    }

    @Test
    public void testPerimeter() {
        // perimeter is expected to be 16
        double expectedPerimeter = 16.0d;
        double actualPerimeter   = square.getPerimeter();

        square            = new Square(1);
        expectedPerimeter = 4;
        actualPerimeter   = square.getPerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, 0.001d);
        System.out.println("permieter test passed. Integer parameter");

        square            = new Square(1.01d);
        expectedPerimeter = 4 * 1.01d;
        actualPerimeter   = square.getPerimeter();
        assertEquals(expectedPerimeter, actualPerimeter, 0.001d);
        System.out.println("permieter test passed. - double parameter test");
    }
}
