package org.example.item;

import org.example.tax.AppliedTaxPolicy;
import org.example.tax.ItemTax;

import java.util.ArrayList;
import java.util.List;

public class PurchaseCartItem {

    private Item item;
    private int quantity;
    private List<ItemTax> taxes;

    private PurchaseCartItem() {
    }

    public PurchaseCartItem(Item item, int quantity, AppliedTaxPolicy taxPolicy) {
        this.item = item;
        this.quantity = quantity;
        this.taxes = new ArrayList<>();
        taxes.addAll(taxPolicy.apply(this));
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public List<ItemTax> getTaxes() {
        return taxes;
    }

    @Override
    public String toString() {
        return "PurchaseCartItem{" +
                "item=" + item +
                ", quantity=" + quantity +
                '}';
    }
}
