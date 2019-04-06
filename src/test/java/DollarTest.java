import static org.junit.Assert.*;
import org.junit.Test;

public class DollarTest {

    @Test
    public void testDollarDivision() {
        // Given
        Dollar ten = new Dollar(10);

        // When
        Dollar result = ten.dividedBy(2);

        // Then
        assertEquals(new Dollar(4), result);  // Change to 4 to see the failure
    }

    @Test(expected=ArithmeticException.class)
    public void testDollarDividedByZero() {
        // Given
        Dollar ten = new Dollar(10);

        // When
        ten.dividedBy(0);
    }

}