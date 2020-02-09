package org.example.item;

import org.example.tax.AppliedTaxPolicy;
import org.example.tax.ItemTax;

import java.util.ArrayList;
import java.util.List;

public class PurchaseCart {

    private final AppliedTaxPolicy taxPolicy;
    private final List<PurchaseCartItem> items;


    public PurchaseCart(AppliedTaxPolicy taxPolicy) {
        this.taxPolicy = taxPolicy;
        this.items = new ArrayList<>();
    }

    public void add(Item item, int quantity){
        PurchaseCartItem cartItem = new PurchaseCartItem(item, quantity, taxPolicy);
        items.add(cartItem);
    }

    public AppliedTaxPolicy getTaxPolicy() {
        return taxPolicy;
    }

    public List<PurchaseCartItem> getItems() {
        return items;
    }

}
