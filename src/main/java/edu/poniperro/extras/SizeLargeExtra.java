package edu.poniperro.extras;

import edu.poniperro.items.Item;
import edu.poniperro.order.Comanda;
import edu.poniperro.receipt.Prices;

public class SizeLargeExtra extends Extra {
    private final Double SIZE_PRICE = Prices.getExtras().get(SIZE_LARGE);

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
