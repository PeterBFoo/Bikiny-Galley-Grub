package edu.poniperro.receipt;
import edu.poniperro.order.Comanda;
import edu.poniperro.order.Order;
import org.junit.Assert;
import org.junit.Test;

public class TestReceipt {

    @Test
    public void testReceiptExtrasIntegracion() {
        Comanda orderTest = new Order();
        Receipt receiptTest = new Receipt(orderTest);

        // Precios y nombres modificados, aleatorios. No forman parte del menú real
        orderTest.addItem("Burguer Burguer!", 1.5, "sauce");
        orderTest.addItem("Crabby Pottatoes", 1.20, "cheese");
        orderTest.addItem("Onion Rings", 2.50, "sauce");
        orderTest.addItem("Beef Steak", 4.00, "sauce");
        orderTest.addItem("Coca Soda", 0.50, "large");
        orderTest.addItem("Coral Bits", 1.00, "large");

        Assert.assertEquals(13.45, receiptTest.total(), 0);
        receiptTest.print();

        // La salida del receiptTest.print() debe ser esta:

        /**
         *         === ORDER ===
         *     Burguer Burguer! w/ sauce....1,50$ + 0,50$
         *     Crabby Pottatoes w/ cheese....1,20$ + 0,25$
         *     Onion Rings w/ sauce....2,50$ + 0,50$
         *     Beef Steak w/ sauce....4,00$ + 0,50$
         *     Coca Soda w/ large....0,50$ + 0,50$
         *     Coral Bits w/ large....1,00$ + 0,50$
         *     TOTAL -> 13,45$
         */
    }

    @Test
    public void testReceiptSinExtras() {
        Comanda orderTest = new Order();
        Receipt receiptTest = new Receipt(orderTest);

        // Precios y nombres modificados, aleatorios. No forman parte del menú real
        orderTest.addItem("Burguer Burguer!", 1.5);
        orderTest.addItem("Crabby Pottatoes", 1.20);
        orderTest.addItem("Onion Rings", 2.50);
        orderTest.addItem("Beef Steak", 4.00);
        orderTest.addItem("Coca Soda", 0.50);
        orderTest.addItem("Coral Bits", 1.00);

        Assert.assertEquals(10.7, receiptTest.total(), 0);
        receiptTest.print();

        // La salida del receiptTest.print() debe ser esta:

        /**
         *        === ORDER ===
         *     Burguer Burguer!....1,50$
         *     Crabby Pottatoes....1,20$
         *     Onion Rings....2,50$
         *     Beef Steak....4,00$
         *     Coca Soda....0,50$
         *     Coral Bits....1,00$
         *     TOTAL -> 10,70$
         */
    }

    @Test
    public void testReceiptMix() {
        Comanda orderTest = new Order();
        Receipt receiptTest = new Receipt(orderTest);

        // Precios y nombres modificados, aleatorios. No forman parte del menú real
        orderTest.addItem("Burguer Burguer!", 1.5, "sauce");
        orderTest.addItem("Crabby Pottatoes", 1.20);
        orderTest.addItem("Onion Rings", 2.50);
        orderTest.addItem("Beef Steak", 4.00);
        orderTest.addItem("Coca Soda", 0.50, "large");
        orderTest.addItem("Coral Bits", 1.00);

        Assert.assertEquals(11.7, receiptTest.total(), 0);
        receiptTest.print();

        // La salida del receiptTest.print() debe ser esta:

        /**
         *        === ORDER ===
         *     Burguer Burguer! w/ sauce....1,50$ + 0,50$
         *     Crabby Pottatoes....1,20$
         *     Onion Rings....2,50$
         *     Beef Steak....4,00$
         *     Coca Soda w/ large....0,50$ + 0,50$
         *     Coral Bits....1,00$
         *     TOTAL -> 11,70$
         */
    }
}
