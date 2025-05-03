import org.example.Shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    public void testValidShapeCreation() {
        Shape shape = new Shape(3, 5);
        assertEquals("Triangle", shape.getShapeType());
        assertEquals(15, shape.getPerimeter(), 0.0001);
    }

    @Test
    public void testInvalidSidesTooFew() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Shape(1, 5);
        });
        assertEquals("Number of sides must be between 1 and 5.", exception.getMessage());
    }

    @Test
    public void testInvalidSidesTooMany() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Shape(6, 5);
        });
        assertEquals("Number of sides must be between 1 and 5.", exception.getMessage());
    }

    @Test
    public void testInvalidLength() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new Shape(3, 0);
        });
        assertEquals("Length must be positive.", exception.getMessage());
    }

    @Test
    public void testGetArea() {
        Shape square = new Shape(4, 2);
        double expectedArea = (4 * Math.pow(2, 2)) / (4 * Math.tan(Math.PI / 4));
        assertEquals(expectedArea, square.getArea(), 0.0001);
    }

    @Test
    public void testGetShapeType() {
        assertEquals("Triangle", new Shape(3, 5).getShapeType());
        assertEquals("Quadrilateral", new Shape(4, 5).getShapeType());
        assertEquals("Pentagon", new Shape(5, 5).getShapeType());
    }

    @Test
    public void testCanFitIn() {
        Shape small = new Shape(4, 1);
        Shape large = new Shape(4, 10);
        assertTrue(Shape.canFitIn(small, large));
        assertFalse(Shape.canFitIn(large, small));
    }
    //This test will pass
    @Test
    public void testCanFitIn2() {
        Shape small = new Shape(4, 1);
        Shape large = new Shape(5, 14);
        assertTrue(Shape.canFitIn(small, large));
        assertFalse(Shape.canFitIn(large, small));
    }
}
