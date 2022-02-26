package edu.poniperro.extras;

import edu.poniperro.items.Item;
import edu.poniperro.order.Comanda;
import edu.poniperro.receipt.Prices;

public class SauceExtra extends Extra {
    private Double SAUCE_PRICE;

    public SauceExtra() {
        this.extraProduct = SAUCE;

        if (Prices.getExtras().get(SAUCE) == null) {
            Prices.init_prices();
        }

        this.SAUCE_PRICE = Prices.getExtras().get(SAUCE);
    }

    @Override
    public void sumExtras(Comanda comanda) {
        for (Item item : comanda.itemList()) {
            if (item.extra() == SAUCE) {
                comanda.updateTotal(SAUCE_PRICE);
            }
        }
        if (nextExtra != null) {
            nextExtra.get().sumExtras(comanda);
        }
    }
}
