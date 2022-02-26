package edu.poniperro.extras;

import edu.poniperro.items.Item;
import edu.poniperro.order.Comanda;
import edu.poniperro.receipt.Prices;

public class CheeseExtra extends Extra {
    private Double CHEESE_PRICE;

    public CheeseExtra() {
        this.extraProduct = "cheese";

        if (Prices.getExtras().get(CHEESE) == null) {
            Prices.init_prices();
        }

        this.CHEESE_PRICE = Prices.getExtras().get(CHEESE);
    }

    @Override
    public void sumExtras(Comanda comanda) {
        for (Item item : comanda.itemList()) {
            if (item.extra() == CHEESE) {
                comanda.updateTotal(CHEESE_PRICE);
            }
        }

        if (nextExtra != null) {
            nextExtra.get().sumExtras(comanda);
        }
    }
}
