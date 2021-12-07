import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThenICanAssertCalculatedValues extends Stage<ThenICanAssertCalculatedValues> {

    @ExpectedScenarioState
    int calculatorResult;

    public ThenICanAssertCalculatedValues assertCalculatorResultIsCorrect(int expectedAnswer){
        assertEquals(expectedAnswer, calculatorResult);
        return this;
    }

}
