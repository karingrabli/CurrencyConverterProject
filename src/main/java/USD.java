

public class USD extends Coin {
   private final double value = 3.52;
    @Override
    public double getValue() { // this method returns the current value of 1 shekel in dollars
        return value;
    }

    @Override
    public double calculate (double input ) { ////this method will convert the value from dollar to shekel
        return input * getValue() ;
    }
}