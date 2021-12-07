import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class GivenCalculatorObjectInitialised extends Stage<GivenCalculatorObjectInitialised> {

    @ProvidedScenarioState
    Calculator calculator;

    public GivenCalculatorObjectInitialised getInitialisedCalculatorObject(){
        calculator = new Calculator();
        return this;
    }

}
