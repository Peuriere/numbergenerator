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
    private int collection;

    @Given("^a (\\d+) numbers are generated$")
    public void givenACollectionOfNumbersIsGenerated(int collection){
        this.collection = collection;
    }

    @When("^the generation is done$")
    public void whenTheGenerationIsDone(){
        numbers = new HashSet<>();
        for (int i = 0; i < collection; i++) {
            Number result = whenTheNumberIsGenerated();
            numbers.add(result);
        }
        System.out.printf(collection + " numbers were generated.");
    }

    private Number whenTheNumberIsGenerated() {
        return new NumberGenerator().generateNumber();
    }

    @Then("^the collection must contain all values between 0-10 inclusive$")
    public void thenTheCollectionContainsAllValues(){
        Assert.assertEquals(11, numbers.size() );

    }

}
