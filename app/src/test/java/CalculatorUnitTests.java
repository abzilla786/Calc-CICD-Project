import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorUnitTests {
    private static Calculator calculator;

    @BeforeAll
    private static void setup(){
        calculator = new Calculator();
    }

    @Test
    public void testAddition(){
        assertEquals(4, calculator.addition(2,2));
    }
}
