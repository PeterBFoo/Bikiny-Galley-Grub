package edu.poniperro.receipt;

import java.util.HashMap;
import java.util.Map;

public class Prices {
    private static final Map<String, Double> extras = new HashMap<>();

    public static void init_prices() {
        extras.put("cheese", 0.25);
        extras.put("sauce", 0.5);
        extras.put("medium", 0.25);
        extras.put("large", 0.5);
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
