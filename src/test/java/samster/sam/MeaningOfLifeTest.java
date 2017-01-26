package samster.sam;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by samanthapeuriere on 26/01/17.
 */
public class MeaningOfLifeTest {

    @Test
    public void returnsEvenNumber() throws Exception {
       int number = new MeaningOfLife().getNumber();

       Assert.assertTrue(number % 2 == 0);

    }

    @Test
    public void endsIn2() throws Exception {
        int number = new MeaningOfLife().getNumber();

        Assert.assertEquals(2, number % 10);
    }

    @Test
    public void greaterThan9() throws Exception {
        int number = new MeaningOfLife().getNumber();

        Assert.assertTrue( number > 9);

    }

    @Test
    public void lessThan100() throws Exception {
        int number = new MeaningOfLife().getNumber();

        Assert.assertTrue(number < 100);

    }

    @Test
    public void addingNumbersResult6() throws Exception {
        int number = new MeaningOfLife().getNumber();

        Assert.assertEquals( 6, number % 10 + number /10);
    }
}