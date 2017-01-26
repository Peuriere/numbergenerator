package samster.integration;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import samster.sam.MeaningOfLifeValidator;
import samster.sam.NumberPicker;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by samanthapeuriere on 23/01/17.
 */
public class StepDefinitions {

    private Set<Number> numbers;
    private int collection;
    private String guess;
    private boolean validationResult;

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
        return new NumberPicker().generateNumber();
    }

    @Then("^the collection must contain all values between 0-10 inclusive$")
    public void thenTheCollectionContainsAllValues(){
        Assert.assertEquals(11, numbers.size() );

    }

    @Given("^The guess is (.+)$")
    public void theGuessIsGuess(String guess) throws Throwable {
        this.guess = guess;
    }

    @When("^the guess is validated$")
    public void theGuessIsValidated() throws Throwable {
        validationResult = new MeaningOfLifeValidator().validate(guess);
    }

    @Then("^the answer is (.+)$")
    public void theAnswerIsAnswer(boolean answer) throws Throwable {
        Assert.assertEquals(answer, validationResult);
    }
}
