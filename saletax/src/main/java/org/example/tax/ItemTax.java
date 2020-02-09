package org.example.tax;

import org.example.item.Item;
import org.example.item.PurchaseCartItem;

import java.math.BigDecimal;

public class ItemTax {

    private PurchaseCartItem cartItem;
    private BigDecimal taxed;

    public ItemTax(PurchaseCartItem cartItem, String tax) {
        this.cartItem = cartItem;
        this.taxed = new BigDecimal(tax);
    }

    public BigDecimal getTotal(){
        return (cartItem.getItem().getPrice().getPrice()
                    .multiply(new BigDecimal(cartItem.getQuantity())))
                    .add(taxed);
    }

    public PurchaseCartItem getCartItem() {
        return cartItem;
    }

    public BigDecimal getTaxed() {
        return taxed;
    }

    @Override
    public String toString() {
        return "ItemTax{" +
                "cartItem=" + cartItem +
                ", taxed=" + taxed +
                '}';
    }
}
