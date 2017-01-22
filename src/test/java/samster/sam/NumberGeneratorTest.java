package samster.sam;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by samanthapeuriere on 22/01/17.
 */
public class NumberGeneratorTest {

    @Test
    public void notAlwaysTheSameNumber() throws Exception {
        //given:

        //when:
        Set<Number> numbers = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(whenTheNumberIsGenerated());
        }

        //then:
        Assert.assertTrue(numbers.size() > 1);
    }

    @Test
    public void produceNumber() throws Exception {
        //given:

        //when:
        Number number = whenTheNumberIsGenerated();

        //then:
        Assert.assertNotNull(number);
        Assert.assertTrue(number.intValue() >= 0 );
        Assert.assertTrue(number.intValue() <= 10);
    }

    private Number whenTheNumberIsGenerated() {
        return new NumberGenerator().generateNumber();
    }
}
