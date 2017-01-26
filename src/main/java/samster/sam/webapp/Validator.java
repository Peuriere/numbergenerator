package samster.sam.webapp;

import org.springframework.stereotype.Component;
import samster.sam.MeaningOfLife;

/**
 * Created by samanthapeuriere on 26/01/17.
 */
public interface Validator {

    boolean validate(String guess);
}
