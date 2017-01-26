package samster.sam;

import org.springframework.stereotype.Component;
import samster.sam.webapp.Validator;

/**
 * Created by samanthapeuriere on 26/01/17.
 */
@Component
public class MeaningOfLifeValidator implements Validator {
    @Override
    public boolean validate(String guess) {
        try {
            return new MeaningOfLife().getNumber() == Integer.parseInt(guess);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
