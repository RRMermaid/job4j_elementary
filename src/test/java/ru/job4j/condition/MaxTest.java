import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MaxTest {

    @Test
    public void testMaxTwoNumbers() {
        assertEquals(9, Max.findMax(9, 6)); // Используем findMax вместо max
    }

    @Test
    public void testMaxThreeNumbers() {
        assertEquals(7, Max.findMax(3, 7, 3)); // Используем findMax вместо max
    }

    @Test
    public void testMaxFourNumbers() {
        assertEquals(9, Max.findMax(5, 5, 7, 9)); // Используем findMax вместо max
    }
}
