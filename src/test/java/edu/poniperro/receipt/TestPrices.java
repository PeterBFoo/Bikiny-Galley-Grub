package edu.poniperro.receipt;

import edu.poniperro.extras.Prices;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class TestPrices {

    @Test
    public void testPrices() {
        Map <String, Double> extras = Prices.getExtras();

        extras.put("cheese", 0.25);
        extras.put("large", 0.5);

        Assert.assertEquals(0.25, extras.get("cheese"), 0);
        Assert.assertEquals(0.5, extras.get("large"), 0);
    }
}
