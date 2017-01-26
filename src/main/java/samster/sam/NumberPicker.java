package samster.sam;

import java.util.Random;

/**
 * Created by samanthapeuriere on 22/01/17.
 */
public class NumberPicker {
    public Number generateNumber() {
        Number number = new Random().nextInt(11);
        return number ;
    }
}
