package figures;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * The class processes the incoming fractional number and rounds to two decimal places.
 *
 * @author Alesia Slizhova
 */

public class Round {
    private static final int SCALE_SIZE = 2;

    /**
     * Method, returns a string containing the result of dividing numbers
     * formed from incoming strings
     *
     * @param digit - input fractional number
     * @return digit - fractional rounding to two decimal numbers
     */
    public static double getRound(double digit) {
        return new BigDecimal(digit).setScale(SCALE_SIZE, RoundingMode.HALF_UP).doubleValue();
    }
}
