import java.text.*;

public class NumberFormatter {
    static public String myCustomFormat(String pattern, double valueToFormat) {
        /*
         * this method instantiates a DecimalFormat instance and allows for formatting
         * decimal numbers into custom formats like $25.75 or 100,200,300.00
         */
        DecimalFormat myFormatter = new DecimalFormat(pattern);
        String stringFormattedDouble = myFormatter.format(valueToFormat);
        return stringFormattedDouble;
    }
}
