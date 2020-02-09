package org.example.tax;

import org.example.item.Item;

public interface TaxExemptionPolicy {
    public boolean checkItemForTaxExemption(Item item);
}
