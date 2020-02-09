package org.example;

import org.example.item.PurchaseCart;
import org.example.item.PurchaseCartItem;
import org.example.tax.ItemTax;

import java.math.BigDecimal;

public class GenerateInvoice {
    public static void generate(PurchaseCart cart) {
        BigDecimal bigDecimal = BigDecimal.ZERO;

        for (PurchaseCartItem item : cart.getItems()) {

            BigDecimal totalTaxedAmt = item.getTaxes().stream()
                    .map(ItemTax::getTotal)
                    .reduce(BigDecimal.ZERO, BigDecimal::add);

            bigDecimal = bigDecimal.add(totalTaxedAmt);

            System.out.println(item.getQuantity()
                    + " " + item.getItem().getName()
                    + " at : " + totalTaxedAmt);
        }

        System.out.println("Total Sales tax : " + bigDecimal);
    }
}
