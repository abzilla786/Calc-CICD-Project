import com.tngtech.jgiven.Stage;
import com.tngtech.jgiven.annotation.ExpectedScenarioState;
import com.tngtech.jgiven.annotation.ProvidedScenarioState;

public class WhenIUseTheCalculatorMethods extends Stage<WhenIUseTheCalculatorMethods> {

    @ExpectedScenarioState
    Calculator calculator;

    @ProvidedScenarioState
    int calculatorResult;

    public WhenIUseTheCalculatorMethods additionIsTestedUsing(int num1, int num2){
        calculatorResult = calculator.addition(num1, num2);
        return this;
    }

    public WhenIUseTheCalculatorMethods subtractionIsTestedUsing(int num1, int num2){
        calculatorResult = calculator.subtraction(num1, num2);
        return this;
    }
}
