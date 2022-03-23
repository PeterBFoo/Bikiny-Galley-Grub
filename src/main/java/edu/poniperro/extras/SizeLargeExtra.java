package edu.poniperro.extras;

import edu.poniperro.items.Item;
import edu.poniperro.order.Comanda;
import edu.poniperro.items.Prices;

public class SizeLargeExtra extends Extra {
    private final Double SIZE_PRICE;

    public SizeLargeExtra() {
        this.extraProduct = Prices.LARGE.getDomainName();
        this.SIZE_PRICE = Prices.LARGE.getPrice();
    }

    @Override
    public void sumExtras(Comanda comanda) {
        for (Item item : comanda.itemList()) {
            if (item.extra().equals(this.extraProduct)) {
                comanda.updateTotal(SIZE_PRICE);
            }
        }
        if (nextExtra != null) {
            nextExtra.get().sumExtras(comanda);
        }
    }
}
