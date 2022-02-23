package edu.poniperro.items;

import org.junit.Assert;
import org.junit.Test;

public class TestItem {

    @Test
    public void testItemSinExtra() {
        Item item = new Item("Patty Burguer", 1.25);

        Assert.assertNotNull(item);
        Assert.assertFalse(item.isRegular());
    }

    @Test
    public void testItemConExtra() {
        Item item = new Item("Patty Burguer", 1.25, "cheese");

        Assert.assertNotNull(item);
        Assert.assertTrue(item.isRegular());
    }
}
