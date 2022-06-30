public class CoinsFactory {
//    public Coin getCoin(String coinType) {
//        if (coinType == null) {
//            return null;
//        }
//        if (coinType.equalsIgnoreCase("USD")) {
//            return new USD();
//        } else if (coinType.equalsIgnoreCase("ILS")) {
//            return new ILS();
//        }
//        return null;
//    }
    public static Coin getCoinInstance (Coins coin) {
        switch (coin) {
            case ILS:
                return new ILS();

            case USD:
                return new USD();
        }
        return null;
    }
}



