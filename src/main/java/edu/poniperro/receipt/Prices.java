package edu.poniperro.receipt;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    private static final Map<String, Double> extras = new HashMap<>();

    public static void init_prices() {
        extras.putIfAbsent("cheese", 0.25);
        extras.putIfAbsent("sauce", 0.5);
        extras.putIfAbsent("medium", 0.25);
        extras.putIfAbsent("large", 0.5);
    }

    public static void display() {
        for (String extra : extras.keySet()) {
            System.out.println("    " + extra + " -> " + extras.get(extra));
        }
    }

    public static Map<String, Double> getExtras() {
        return extras;
    }
}
