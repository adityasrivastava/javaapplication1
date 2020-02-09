package org.example.tax;

import org.example.item.Item;
import org.example.item.ItemType;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BSTTaxExemptionPolicy implements TaxExemptionPolicy {

    private Set<ItemType> itemExempted;

    public BSTTaxExemptionPolicy(ItemType ... types) {
        this.itemExempted = new HashSet<>(Arrays.asList(types));
    }

    @Override
    public boolean checkItemForTaxExemption(Item item) {
        return !itemExempted.contains(item.getType());
    }
}
