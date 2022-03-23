package edu.poniperro.items;

import edu.poniperro.items.Prices;
import org.junit.Assert;
import org.junit.Test;

import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class TestPrices {

    @Test
    public void testPrices() {

        Prices[] extras = Prices.getExtras();

        /**
         * Checking that getPrice() and getPrice(args) returns what is expected
         */
        for (Prices extra : extras) {
            Assert.assertNotNull(extra.getPrice());
            Assert.assertNotNull(Prices.getPrice(extra.getDomainName()));
        }

        /**
         * If getPrice(args) doesn't match with any of the objects, returns 0
         */
        Assert.assertEquals(0.0, Prices.getPrice("prueba"), 0);

        Assert.assertEquals(0.25, Prices.CHEESE.getPrice(), 0);
        Assert.assertEquals(0.5, Prices.LARGE.getPrice(), 0);
        Assert.assertEquals(0.5, Prices.SAUCE.getPrice(), 0);
        Assert.assertEquals(0.25, Prices.MEDIUM.getPrice(), 0);
    }

    @Test
    public void testPriceAndDomainName() {
        Assert.assertEquals("cheese", Prices.getDomainName("cheese"));
        Assert.assertEquals("sauce", Prices.getDomainName("sauce"));
        Assert.assertEquals("large", Prices.getDomainName("large"));
        Assert.assertEquals("medium", Prices.getDomainName("medium"));

        Assert.assertNull(Prices.getDomainName("prueba"));
    }
}
