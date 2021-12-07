import com.tngtech.jgiven.junit5.ScenarioTest;
import org.junit.jupiter.api.Test;

public class TestCalculatorJgiven extends ScenarioTest<GivenCalculatorObjectInitialised, WhenIUseTheCalculatorMethods, ThenICanAssertCalculatedValues> {

    @Test
    public void testCalculatorEdition(){
        given().getInitialisedCalculatorObject();
        when().additionIsTestedUsing(2,2);
        then().assertCalculatorResultIsCorrect(4);
    }

}
