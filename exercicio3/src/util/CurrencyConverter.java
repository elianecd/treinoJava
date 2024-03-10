package util;

public class CurrencyConverter {
    public static final double IOF = 1.06;
    public static double calc(double price, double bought) {
        return price * bought * IOF;
    }
}
