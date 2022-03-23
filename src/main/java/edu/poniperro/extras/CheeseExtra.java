package edu.poniperro.extras;

import edu.poniperro.items.Item;
import edu.poniperro.order.Comanda;
import edu.poniperro.items.Prices;

public class CheeseExtra extends Extra {
    private final Double CHEESE_PRICE;

    public CheeseExtra() {
        this.extraProduct = Prices.CHEESE.getDomainName();
        this.CHEESE_PRICE = Prices.CHEESE.getPrice();
    }

    @Override
    public void sumExtras(Comanda comanda) {
        for (Item item : comanda.itemList()) {
            if (item.extra().equals(this.extraProduct)) {
                comanda.updateTotal(CHEESE_PRICE);
            }
        }

        if (nextExtra != null) {
            nextExtra.get().sumExtras(comanda);
        }
    }
}
