package samster.integration;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import samster.sam.NumberGenerator;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by samanthapeuriere on 23/01/17.
 */
public class StepDefinitions {

    private Set<Number> numbers;

    @Given("^a 100 numbers are generated$")
    public void givenA100numbersAreGenerated(){

    }

    @When("^the generation is done$")
    public void whenTheGenerationIsDone(){
        numbers = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            Number result = whenTheNumberIsGenerated();
            numbers.add(result);
        }
    }

    private Number whenTheNumberIsGenerated() {
        return new NumberGenerator().generateNumber();
    }

    @Then("^the collection must contain all values between 0-10 inclusive$")
    public void thenTheCollectionContainsAllValues(){
        Assert.assertEquals(11,numbers.size() );
    }

}
