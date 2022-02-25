package edu.poniperro.extras;

import edu.poniperro.order.Comanda;

import java.util.Optional;

public abstract class Extra {
    static final String CHEESE = "cheese";
    static final String SAUCE = "sauce";
    static final String SIZE_LARGE = "large";
    String extraProduct;
    Optional<Extra> nextExtra;

    public void setNextExtra(Extra extra) {
        this.nextExtra = Optional.ofNullable(extra);
    }

    public abstract void sumExtras(Comanda comanda);
}
