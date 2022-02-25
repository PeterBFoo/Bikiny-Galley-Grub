package edu.poniperro.order;

import edu.poniperro.items.Item;
import org.junit.Assert;
import org.junit.Test;

public class TestOrder {

    @Test
    public void testOrder() {
        Comanda order = new Order();

        Assert.assertNotNull(order);

        order.addItem("Patty Burguer", 1.25);
        order.addItem("Soup", 1.5);
        order.addItem("Crunchy Crab", 2.0);

        Assert.assertEquals(3, order.size());
    }
}
