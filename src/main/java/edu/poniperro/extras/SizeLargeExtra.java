package edu.poniperro.extras;

import edu.poniperro.items.Item;
import edu.poniperro.order.Comanda;
import edu.poniperro.receipt.Prices;

public class SizeLargeExtra extends Extra {
    private Double SIZE_PRICE;

    public SizeLargeExtra() {
        this.extraProduct = SIZE_LARGE;

        if (Prices.getExtras().get(SIZE_LARGE) == null) {
            Prices.init_prices();
        }

        this.SIZE_PRICE = Prices.getExtras().get(SIZE_LARGE);
    }

    @Override
    public void sumExtras(Comanda comanda) {
        for (Item item : comanda.itemList()) {
            if (item.extra() == SIZE_LARGE) {
                comanda.updateTotal(SIZE_PRICE);
            }
        }
        if (nextExtra != null) {
            nextExtra.get().sumExtras(comanda);
        }
    }
}
