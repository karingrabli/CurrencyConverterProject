

public class ILS extends Coin {
    private final double value = 0.28;
    @Override
    public double getValue() { //this method will return the current value of 1 shekel in dollars
        return value ;
    }
    public double calculate (double input ) { //this method will convert the value from shekel to dollar

        return input * getValue();
    }
}
