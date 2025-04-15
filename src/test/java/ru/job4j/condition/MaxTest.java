import org.junit.jupiter.api.Test;
import ru.job4j.condition.Max;

import static org.junit.jupiter.api.Assertions.*;

public class MaxTest {

    @Test
    public void testMaxTwoNumbers() {
        assertEquals(9, Max.findMax(9, 6));
    }

    @Test
    public void testMaxThreeNumbers() {
        assertEquals(7, Max.findMax(3, 7, 3));
    }

    @Test
    public void testMaxFourNumbers() {
        assertEquals(9, Max.findMax(5, 5, 7, 9));
    }
}
